package com.coisini.design.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description Properties工具类
 * @author coisini
 * @date Feb 28, 2022
 * @version 1.0
 */
public class PropertiesUtil {

    /**
     * 根据key读取value
     * @Description: 相对路径， properties文件需在classpath目录下，
     *               比如：config.properties在包com.coisini.util，
     *               路径就是/com/coisini/util/config.properties
     * @param filePath
     * @param keyWord
     * @return String
     * @throws
     */
     private static String getProperties(String filePath, String keyWord){
        Properties prop = new Properties();
        String value = null;
        try {
            InputStream inputStream = PropertiesUtil.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
     }

    /**
     * 根据配置文件提取类名返回实例对象
     * @param filePath
     * @param keyWord
     * @param packagePath
     * @return
     */
     private static Object getBean(String filePath, String keyWord, String packagePath) {
         try {
             String className = getProperties(filePath, keyWord);
             Class<?> c = Class.forName(packagePath + className);
             return c.newInstance();
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }

     }

    /**
     * 根据配置文件提取类名返回实例对象集合
     * @param filePath
     * @param keyWord
     * @param packagePath
     * @return
     */
    private static List<Object> getBeans(String filePath, String keyWord, String packagePath) {
        String[] classNames = getProperties(filePath, keyWord).split(",");
        return Arrays.stream(classNames).map(className -> {
            try {
                return Class.forName(packagePath + className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    /**
     * 获取工厂方法实例对象
     * @return
     */
     public static Object getFactoryMethodBean() {
         return getBean("/com/coisini/design/util/config.properties",
                 "factoryMethod.className",
                 "com.coisini.design.pattern.creational.factorymethod.v3.");
     }

    /**
     * 获取抽象工厂实例对象
     * @return
     */
    public static Object getAbstractFactoryBean() {
        return getBean("/com/coisini/design/util/config.properties",
                "abstractFactory.className",
                "com.coisini.design.pattern.creational.abstractfactory.v3.");
    }

    /**
     * 获取建造者模式实例对象
     * @return
     */
    public static Object getBuilderPatternBean() {
        return getBean("/com/coisini/design/util/config.properties",
                "builderPattern.className",
                "com.coisini.design.pattern.creational.builder.v2.");
    }

    /**
     * 获取外观模式实例对象
     * @return
     */
    public static List<Object> getFacadePatternBeans() {
        return getBeans("/com/coisini/design/util/config.properties",
                "facadePattern.classNames",
                "com.coisini.design.pattern.structural.facade.own.v2.");
    }

    public static void main(String[] args) {
        // 注意路径问题
        String className = getProperties("/com/coisini/design/util/config.properties", "factoryMethod.className");
        System.out.println("factoryMethod.className = " + className);
    }

}

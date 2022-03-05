package com.coisini.design.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

    public static void main(String[] args) {
        // 注意路径问题
        String className = getProperties("/com/coisini/design/util/config.properties", "factoryMethod.className");
        System.out.println("factoryMethod.className = " + className);
    }

}

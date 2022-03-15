package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 反射攻击懒汉式类单例模式测试类（非类加载时）
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = LazySingleton.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}

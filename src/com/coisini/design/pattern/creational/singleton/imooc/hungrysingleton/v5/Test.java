package com.coisini.design.pattern.creational.singleton.imooc.hungrysingleton.v5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 反射攻击饿汉式单例模式解决方案测试类
 * @author coisini
 * @date Mar 11, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = HungrySingleton.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        // 重置构造器权限
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}

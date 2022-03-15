package com.coisini.design.pattern.creational.singleton.imooc.staticInnerclasssingleton.v3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 反射攻击静态内部类单例模式解决方案测试类
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = StaticInnerClassSingleton.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance  = (StaticInnerClassSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}

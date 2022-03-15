package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 反射攻击懒汉式类单例模式测试类（添加逻辑判断）
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objClass = LazySingleton.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        // 正常抛出单例构造器禁止反射调用
        // LazySingleton instance = LazySingleton.getInstance();
        // LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        // 添加逻辑判断正常抛出单例构造器禁止反射调用(防止反射攻击成功)
        // LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        // LazySingleton instance = LazySingleton.getInstance();

        // 修改逻辑判断属性值反射攻击成功
        LazySingleton instance = LazySingleton.getInstance();
        Field flag = instance.getClass().getDeclaredField("flag");
        // TODO 修改权限
        flag.setAccessible(true);
        // TODO 修改属性
        flag.set(instance, true);
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}

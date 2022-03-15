package com.coisini.design.pattern.creational.singleton.imooc.enuminstance.v1;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description Enum枚举单例测试类
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 序列化破坏枚举单测试 1
         * 枚举类天然的序列化机制能够强有力的保证不会出现多次实例化的情况
         */
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) objectInputStream.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData()==newInstance.getData());

        /**
         * 反射攻击枚举单测试
         * Cannot reflectively create enum objects
         */
        Class classObj = EnumInstance.class;
        Constructor constructor = classObj.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumInstance enumInstance = (EnumInstance) constructor.newInstance("Hello", 1);

        EnumInstance newEnumInstance = EnumInstance.getInstance();
        System.out.println(enumInstance);
        System.out.println(newEnumInstance);
        System.out.println(enumInstance==newEnumInstance);

    }
}

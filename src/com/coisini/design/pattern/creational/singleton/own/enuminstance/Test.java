package com.coisini.design.pattern.creational.singleton.own.enuminstance;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 枚举单例测试类
 * @author coisini
 * @date Mar 15, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // DBConnectionProvider dbConnectionProvider = DBConnectionProvider.getInstance();
        // DBConnectionProvider dbConnectionProvider1 = DBConnectionProvider.getInstance();
        // DBConnectionProvider dbConnectionProvider2 = DBConnectionProvider.getInstance();
        //
        // if (dbConnectionProvider == dbConnectionProvider1 && dbConnectionProvider1 == dbConnectionProvider2) {
        //     System.out.println("获取到唯一实例");
        // }
        //
        // dbConnectionProvider.defineSizeOfConnProvider(5);
        //
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("获取连接池对象：" + dbConnectionProvider.getConnProviderMember());
        // }

        /**
         * 序列化攻击测试
         */
        // DBConnectionProvider instance = DBConnectionProvider.getInstance();
        //
        // ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        // oss.writeObject(instance);
        //
        // File file = new File("singleton_file");
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        // DBConnectionProvider newInstance = (DBConnectionProvider) ois.readObject();
        //
        // // 序列化后写入写出的对象不是同一个
        // System.out.println(instance);
        // System.out.println(newInstance);
        // System.out.println(instance == newInstance);

        /**
         * 反射攻击枚举单例测试
         */
        Class classObj = DBConnectionProvider.class;
        Constructor constructor = classObj.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        DBConnectionProvider enumInstance = (DBConnectionProvider) constructor.newInstance("Hello", 1);

        DBConnectionProvider newEnumInstance = DBConnectionProvider.getInstance();
        System.out.println(enumInstance);
        System.out.println(newEnumInstance);
        System.out.println(enumInstance==newEnumInstance);
    }
}

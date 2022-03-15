package com.coisini.design.pattern.creational.singleton.own.lazydoublechecksingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description 懒汉式单例DoubleCheck双重检查测试类
 * @author coisini
 * @date Mar 15, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
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
         * 反射攻击测试
         */
        Class objClass = DBConnectionProvider.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        DBConnectionProvider instance = DBConnectionProvider.getInstance();
        DBConnectionProvider newInstance = (DBConnectionProvider) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }
}

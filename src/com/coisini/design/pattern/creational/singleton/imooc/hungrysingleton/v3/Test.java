package com.coisini.design.pattern.creational.singleton.imooc.hungrysingleton.v3;

import java.io.*;

/**
 * @Description 序列化破坏单例模式解决方案测试类
 * @author coisini
 * @date Mar 11, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();

        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oss.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        /**
         * ObjectStreamClass 1057行源码
         * 单例类包含readResolve方法的情况下可以解决序列化破坏单例模式的问题
         */
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}

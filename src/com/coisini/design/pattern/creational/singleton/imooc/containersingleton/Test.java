package com.coisini.design.pattern.creational.singleton.imooc.containersingleton;

/**
 * @Description 容器单例测试类（存在线程安全问题）
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program end");

        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
    }
}

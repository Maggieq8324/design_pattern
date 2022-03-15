package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v1;

/**
 * @Description 懒汉式单例测试类（多线程）
 * @author coisini
 * @date Mar 7, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 懒汉式单例测试单线程
         */
        // LazySingleton lazySingleton = LazySingleton.getInstance();
        // System.out.println("Test main: " + lazySingleton);

        /**
         * 多线程情况使用debug干扰进程，懒汉式呈现不安全，new了多个对象
         */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program end ");
    }
}

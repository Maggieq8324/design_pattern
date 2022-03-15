package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v2;

/**
 * @Description 懒汉式单例测试类（同步锁解决多线程安全问题）
 * @author coisini
 * @date Mar 7, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 使用同步锁后单例模式呈线程安全状态
         */
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program end ");
    }
}

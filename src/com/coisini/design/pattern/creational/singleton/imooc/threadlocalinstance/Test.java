package com.coisini.design.pattern.creational.singleton.imooc.threadlocalinstance;

/**
 * @Description ThreadLocal线程单例测试类
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

        /**
         * 主线程中的对象为同一个，
         * ThreadLocal会为每个线程提供一个独立的变量副本，ThreadLocal基于ThreadLocalMap实现的
         * ThreadLocal维持了线程间的隔离，隔离了多个线程对数据的访问冲突
         * 同步锁是以时间换空间，ThreadLocal以空间换时间，它会创建很多对象，对于每个线程获取的对象是唯一的
         * 基于ThreadLocal的单例模式为每一个线程都提供了一个对象，在多线程进行访问时相互不会影响
         */
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());
        System.out.println(ThreadLocalInstance.getInstance());

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("Program end");
    }
}

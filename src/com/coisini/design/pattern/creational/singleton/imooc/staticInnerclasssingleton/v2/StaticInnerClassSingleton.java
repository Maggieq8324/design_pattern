package com.coisini.design.pattern.creational.singleton.imooc.staticInnerclasssingleton.v2;

/**
 * @Description 静态内部类单例模式
 * 基于类初始化的延迟加载解决方案
 * 场景：解决多线程下重排序问题
 * 静态内部类单例模式允许重排序，但不允许其它线程看到这个重排序
 * 原理：Jvm在类的初始化阶段，也就是class被加载后且被线程使用之前都是类的初始化阶段，在这个阶段会执行类的初始化
 * 在执行类的初始化期间，Jvm会获取一个锁（Class对象初始化锁），这个锁可以同步多个线程对一个类的初始化
 * 基于该特性，可以实现基于静态内部类的线程安全的延迟初始化方案（非构造线程不允许看到重排序）
 *
 * 静态内部类和DoubleCheck都是为了做延迟初始化来降低创建单例实例的开销
 * @author coisini
 * @date Mar 9, 2022
 * @version 1.0
 */
public class StaticInnerClassSingleton {

    /**
     * 静态内部类单例模式的核心在于InnerClass对象的初始化锁
     */
    private static class InnerClass {
        public static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {}

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

}

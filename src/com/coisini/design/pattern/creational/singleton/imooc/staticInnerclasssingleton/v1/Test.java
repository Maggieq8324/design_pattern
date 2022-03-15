package com.coisini.design.pattern.creational.singleton.imooc.staticInnerclasssingleton.v1;

/**
 * @Description 静态内部类单例模式测试类
 * @author coisini
 * @date Mar 9, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program end ");
    }
}

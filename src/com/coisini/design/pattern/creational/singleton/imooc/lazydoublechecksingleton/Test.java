package com.coisini.design.pattern.creational.singleton.imooc.lazydoublechecksingleton;

/**
 * @Description 懒汉式单例模式DoubleCheck双重检查测试类
 * @author coisini
 * @date Mar 8, 2022
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

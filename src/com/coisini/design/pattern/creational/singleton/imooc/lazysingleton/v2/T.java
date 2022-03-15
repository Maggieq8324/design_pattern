package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v2;

/**
 * @Description 线程
 * @author coisini
 * @date Mar 7, 2022
 * @version 1.0
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
    }
}

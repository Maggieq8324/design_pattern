package com.coisini.design.pattern.creational.singleton.imooc.containersingleton;

/**
 * @Description 线程
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class T implements Runnable {
    @Override
    public void run() {
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}

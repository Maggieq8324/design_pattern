package com.coisini.design.pattern.creational.singleton.imooc.threadlocalinstance;

/**
 * @Description 线程
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLocalInstance);
    }
}

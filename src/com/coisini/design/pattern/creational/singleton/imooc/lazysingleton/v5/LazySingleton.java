package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v5;

/**
 * @Description 懒汉式单例模式（线程安全）
 * @author coisini
 * @date Mar 7, 2022
 * @version 1.0
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    private LazySingleton() {
        /**
         * 添加逻辑判断
         */
        if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * synchronized同步锁写法1（较消耗资源，有加锁解锁开销）
     * synchronized同步锁使方法变成同步方法
     * synchronized修饰static静态方法时锁的是class文件，范围较广，对性能有一定影响
     * 如不是静态方法锁的则是堆内存中生成的对象
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    /**
     * synchronized同步锁写法2
     * 作用同synchronized同步锁写法1
     * 此时作用于类上
     * @return
     */
    public static LazySingleton getInstance1() {
        synchronized(LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }

        return lazySingleton;
    }



}

package com.coisini.design.pattern.creational.singleton.imooc.lazysingleton.v1;

/**
 * @Description 懒汉式单例模式（线程不安全）
 * @author coisini
 * @date Mar 7, 2022
 * @version 1.0
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

}

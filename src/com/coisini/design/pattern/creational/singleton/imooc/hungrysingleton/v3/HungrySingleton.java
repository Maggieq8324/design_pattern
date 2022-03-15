package com.coisini.design.pattern.creational.singleton.imooc.hungrysingleton.v3;

import java.io.Serializable;

/**
 * @Description 饿汉式单例模式
 * @author coisini
 * @date Mar 11, 2022
 * @version 1.0
 */
public class HungrySingleton implements Serializable {

    // 写法一
    // private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // 写法二
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 固定名称，ObjectStreamClass 521行源码中 固定该名称
     * @return
     */
    public Object readResolve() {
        return hungrySingleton;
    }
}

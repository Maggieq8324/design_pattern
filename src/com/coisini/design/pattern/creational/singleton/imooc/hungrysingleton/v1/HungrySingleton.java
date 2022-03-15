package com.coisini.design.pattern.creational.singleton.imooc.hungrysingleton.v1;

/**
 * @Description 饿汉式单例模式
 * @author coisini
 * @date Mar 11, 2022
 * @version 1.0
 */
public class HungrySingleton {

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
}

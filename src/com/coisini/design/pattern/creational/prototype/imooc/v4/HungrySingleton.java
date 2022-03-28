package com.coisini.design.pattern.creational.prototype.imooc.v4;

import java.io.Serializable;

/**
 * @Description 饿汉式单例模式
 * @author coisini
 * @date Mar 11, 2022
 * @version 1.0
 */
public class HungrySingleton implements Serializable, Cloneable {

    // 写法一
    // private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // 写法二
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();

        /**
         * 防止克隆破坏单例的方法
         * 1、不实现Cloneable接口
         * 2、clone()方法中返回对象实例
         */
        return getInstance();
    }
}

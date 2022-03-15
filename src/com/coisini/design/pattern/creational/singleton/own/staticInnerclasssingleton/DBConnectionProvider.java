package com.coisini.design.pattern.creational.singleton.own.staticInnerclasssingleton;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.Random;

/**
 * @Description 数据库连接池（静态内部类单例模式）
 * @author coisini
 * @date Mar 15, 2022
 * @version 1.0
 */
public class DBConnectionProvider implements Serializable {

    private static LinkedList<Object> dbList;

    /**
     * 静态内部类
     * 静态内部类单例模式的核心在于InnerClass对象的初始化锁
     */
    private static class InnerClass {
        private static final DBConnectionProvider dbConnectionProvider = new DBConnectionProvider();
    }

    /**
     * 私有构造函数
     */
    private DBConnectionProvider() {
        if (InnerClass.dbConnectionProvider != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 返回唯一实例
     * @return
     */
    public static DBConnectionProvider getInstance() {
        return InnerClass.dbConnectionProvider;
    }

    /**
     * 定义数据库连接池大小
     * @param size
     */
    public void defineSizeOfConnProvider(int size) {
        dbList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            dbList.add(new Object());
        }
    }

    /**
     * 随机获取数据库连接对象
     * @return
     */
    public Object getConnProviderMember() {
        Random random = new Random();
        return dbList.get(random.nextInt(dbList.size()));
    }

    /**
     * 固定名称，ObjectStreamClass 521行源码中 固定该名称
     * @return
     */
    public Object readResolve() {
        return InnerClass.dbConnectionProvider;
    }

}

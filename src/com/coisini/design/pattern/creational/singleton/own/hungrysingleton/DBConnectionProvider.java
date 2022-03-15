package com.coisini.design.pattern.creational.singleton.own.hungrysingleton;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Random;

/**
 * @Description 数据库连接池（饿汉式单例）
 * @author coisini
 * @date Mar 15, 2022
 * @version 1.0
 */
public class DBConnectionProvider implements Serializable {

    private final static DBConnectionProvider dbConnProvider;

    private static boolean flag = true;

    /**
     * 初始化静态变量
     */
    static {
        dbConnProvider = new DBConnectionProvider();
    }

    /**
     * 私有构造函数
     */
    private DBConnectionProvider() {
        if (dbConnProvider != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 数据库连接对象集合
     */
    private static LinkedList<Object> dbList;

    /**
     * 返回唯一实例
     * @return
     */
    public static DBConnectionProvider getInstance() {
        return dbConnProvider;
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
        return dbConnProvider;
    }

}

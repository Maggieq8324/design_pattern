package com.coisini.design.pattern.creational.singleton.own.threadlocalinstance;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Random;

/**
 * @Description 数据库连接池（ThreadLocal线程单例）
 * @author coisini
 * @date Mar 15,, 2022
 * @version 1.0
 */
public class DBConnectionProvider implements Serializable {

    private final static ThreadLocal<DBConnectionProvider> threadLocal = ThreadLocal.withInitial(DBConnectionProvider::new);

    /**
     * 数据库连接对象集合
     */
    private static LinkedList<Object> dbList;

    /**
     * 私有构造函数
     */
    private DBConnectionProvider() {}

    /**
     * 返回唯一实例
     * @return
     */
    public static DBConnectionProvider getInstance() {
        return threadLocal.get();
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
        return threadLocal.get();
    }

}

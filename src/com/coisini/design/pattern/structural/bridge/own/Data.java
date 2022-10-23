package com.coisini.design.pattern.structural.bridge.own;

/**
 * @Description 抽象数据类：抽象类
 * @Author coisini
 * @Date Oct 23, 2022
 * @Version 1.0
 */
public abstract class Data {

    protected DB db;

    public Data(DB db) {
        this.db = db;
    }

    /**
     * 导出数据
     */
    public abstract void export();

}

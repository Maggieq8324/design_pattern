package com.coisini.design.pattern.structural.adapter.own.defaultadapter;

/**
 * @Description 数据库操作接口抽象类
 * @Author coisini
 * @Date Jul 31,2022
 * @Version 1.0
 */
public abstract class AbstractOperation implements DBOperation {

    private final DBUtil dbUtil;

    protected AbstractOperation() {
        this.dbUtil = new DBUtil();
    }

    @Override
    public void save(User user) {
        dbUtil.save(user);
    }

    @Override
    public void save1(User user) {

    }
}

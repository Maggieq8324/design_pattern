package com.coisini.design.pattern.structural.adapter.own.defaultadapter;

/**
 * @Description 数据库操作接口
 * @Author coisini
 * @Date Jul 30, 2022
 * @Version 1.0
 */
public interface DBOperation {

    /**
     * 保存
     * @param user 用户
     */
    void save(User user);

    void save1(User user);

}

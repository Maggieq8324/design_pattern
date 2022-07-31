package com.coisini.design.pattern.structural.adapter.own.classadapter;

/**
 * @Description 数据库操作类
 * @author coisini
 * @date Jun 7, 2022
 * @version 1.0
 */
public class DBUtil {

    /**
     * 保存
     * @param user 用户
     */
    public void save(User user) {
        System.out.println("用户信息：" + user + " 保存到数据库");
    }

}

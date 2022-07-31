package com.coisini.design.pattern.structural.adapter.own.defaultadapter;

/**
 * @Description 缺省适配器测试类
 * @Author coisini
 * @Date Jul 31, 2022
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setToken("123456789");
        user.setMail("maggieq8324@gmail.com");

        DBOperation dbOperation = new OperationAdapter();
        dbOperation.save(user);
    }
}

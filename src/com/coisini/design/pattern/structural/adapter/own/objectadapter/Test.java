package com.coisini.design.pattern.structural.adapter.own.objectadapter;

/**
 * @Description 对象适配器测试类
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setToken("123456789");
        user.setMail("maggieq8324@gmail.com");

        DBOperation DBOperation = new OperationAdapter();
        DBOperation.save(user);
    }

}

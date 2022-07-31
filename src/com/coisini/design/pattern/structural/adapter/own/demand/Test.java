package com.coisini.design.pattern.structural.adapter.own.demand;

/**
 * @Description Sunny软件公司OA系统需要提供一个加密模块，将用户机密信息（如口令、邮箱等）加密之后再存储在数据库中，
 *    系统已经定义好了数据库操作类。为了提高开发效率，现需要重用已有的加密算法，这些算法封装在一些由第三方提供的类中，
 *    有些甚至没有源代码。试使用适配器模式设计该加密模块，实现在不修改现有类的基础上重用第三方加密方法。
 * @Author coisini
 * @Date
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setToken("123456789");
        user.setMail("maggieq8324@gmail.com");

        DBUtil dbUtil = new DBUtil();
        dbUtil.save(user);
    }
}

package com.coisini.design.pattern.creational.prototype.imooc.v3;

import java.util.Date;

/**
 * @Description 深克隆、浅克隆测试类
 * @author coisini
 * @date Mar 17, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig1 == pig2);
        System.out.println(pig1.getBirthday()==pig2.getBirthday());
        System.out.println(pig1.getName()==pig2.getName());

        pig2.getBirthday().setTime(66666666666L);

        // 不添加深克隆的情况下修改pig1后pig2的值也跟着修改了
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig1 == pig2);
        System.out.println(pig1.getBirthday()==pig2.getBirthday());
        System.out.println(pig1.getName()==pig2.getName());

    }
}

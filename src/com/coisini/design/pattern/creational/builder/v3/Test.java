package com.coisini.design.pattern.creational.builder.v3;

/**
 * @Description 建造者模式（链式调用）测试类
 * @author coisini
 * @date Mar 6, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.construct());
    }
}

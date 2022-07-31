package com.coisini.design.pattern.structural.adapter.imooc.classadapter;

/**
 * @Description 类适配器模式测试类
 * @author coisini
 * @date May 10, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

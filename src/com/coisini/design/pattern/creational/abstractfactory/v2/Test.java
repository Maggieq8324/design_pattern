package com.coisini.design.pattern.creational.abstractfactory.v2;

/**
 * @Description 抽象工厂测试类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        InitFactory initFactory = new AndroidInitFactory();
        Operation operation = initFactory.getOperation();
        Surface surface = initFactory.getSurface();
        operation.init();
        surface.init();

        initFactory = new IOSInitFactory();
        operation = initFactory.getOperation();
        surface = initFactory.getSurface();
        operation.init();
        surface.init();
    }

}

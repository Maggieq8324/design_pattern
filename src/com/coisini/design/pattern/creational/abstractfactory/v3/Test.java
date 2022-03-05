package com.coisini.design.pattern.creational.abstractfactory.v3;

import com.coisini.design.util.PropertiesUtil;

/**
 * @Description 抽象工厂测试类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        InitFactory initFactory = (InitFactory) PropertiesUtil.getAbstractFactoryBean();
        Operation operation = initFactory.getOperation();
        Surface surface = initFactory.getSurface();
        operation.init();
        surface.init();
    }

}

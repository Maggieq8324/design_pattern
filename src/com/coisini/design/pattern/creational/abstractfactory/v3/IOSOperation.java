package com.coisini.design.pattern.creational.abstractfactory.v3;

/**
 * @Description IOS操作功能产品类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class IOSOperation extends Operation {
    @Override
    public void init() {
        System.out.println("初始化IOS操作功能");
    }
}

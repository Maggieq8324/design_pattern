package com.coisini.design.pattern.creational.abstractfactory.v3;

/**
 * @Description Android操作功能产品类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class AndroidOperation extends Operation {
    @Override
    public void init() {
        System.out.println("初始化Android操作功能");
    }
}

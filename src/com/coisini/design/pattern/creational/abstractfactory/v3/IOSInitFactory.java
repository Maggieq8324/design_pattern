package com.coisini.design.pattern.creational.abstractfactory.v3;

/**
 * @Description IOS初始化工厂类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class IOSInitFactory implements InitFactory {
    @Override
    public Operation getOperation() {
        return new IOSOperation();
    }

    @Override
    public Surface getSurface() {
        return new IOSSurface();
    }
}

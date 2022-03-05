package com.coisini.design.pattern.creational.abstractfactory.v1;

/**
 * @Description IOS操作功能工厂类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class IOSOperationFactory implements OperationFactory {
    @Override
    public Operation getOperation() {
        return new IOSOperation();
    }
}

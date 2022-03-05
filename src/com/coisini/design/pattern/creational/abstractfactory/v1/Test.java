package com.coisini.design.pattern.creational.abstractfactory.v1;

/**
 * @Description 工厂方法模式测试类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        OperationFactory operationFactory = new AndroidOperationFactory();
        Operation operation = operationFactory.getOperation();
        operation.init();

        operationFactory = new IOSOperationFactory();
        operation = operationFactory.getOperation();
        operation.init();

        SurfaceFactory surfaceFactory = new AndroidSurfaceFactory();
        Surface surface = surfaceFactory.getSurface();
        surface.init();

        surfaceFactory = new IOSSurfaceFactory();
        surface = surfaceFactory.getSurface();
        surface.init();
    }

}

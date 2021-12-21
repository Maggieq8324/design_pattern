package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description Python 工厂方法
 * @author coisini
 * @date Dec 22, 2021
 * @Version 1.0
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}

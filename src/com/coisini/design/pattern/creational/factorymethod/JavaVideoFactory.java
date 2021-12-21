package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description Java 工厂方法
 * @author coisini
 * @date Dec 22， 2021
 * @Version 1.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}

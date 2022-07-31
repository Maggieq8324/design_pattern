package com.coisini.design.pattern.structural.adapter.imooc.objectadapter;

/**
 * @Description 目标实现类
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}

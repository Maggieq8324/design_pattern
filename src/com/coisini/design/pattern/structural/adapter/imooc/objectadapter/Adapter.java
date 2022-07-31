package com.coisini.design.pattern.structural.adapter.imooc.objectadapter;

/**
 * @Description 适配器
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}

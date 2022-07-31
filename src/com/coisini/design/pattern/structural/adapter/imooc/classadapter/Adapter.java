package com.coisini.design.pattern.structural.adapter.imooc.classadapter;

/**
 * @Description 适配器
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}

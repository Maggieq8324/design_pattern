package com.coisini.design.pattern.structural.composite.own.transparent;

/**
 * @Description 抽象组件
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public abstract class Component {

    public void add(Component component) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public abstract void display();

}

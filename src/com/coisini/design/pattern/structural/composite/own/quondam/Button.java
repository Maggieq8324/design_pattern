package com.coisini.design.pattern.structural.composite.own.quondam;

/**
 * @Description 单元控件：按钮
 * @Author coisini
 * @Date Sep 215, 2022
 * @Version 1.0
 */
public class Button {

    private final String name;

    public Button(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }
}

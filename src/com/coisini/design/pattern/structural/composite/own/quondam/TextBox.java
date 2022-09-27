package com.coisini.design.pattern.structural.composite.own.quondam;

/**
 * @Description 单元控件：文本框
 * @Author coisini
 * @Date Sep 25, 2022
 * @Version 1.0
 */
public class TextBox {

    private final String name;

    public TextBox(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }
}

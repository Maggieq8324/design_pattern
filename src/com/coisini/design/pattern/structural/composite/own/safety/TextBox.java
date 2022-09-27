package com.coisini.design.pattern.structural.composite.own.safety;

/**
 * @Description 文本框：叶子构件
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class TextBox extends Component {

    private final String name;

    public TextBox(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }
}

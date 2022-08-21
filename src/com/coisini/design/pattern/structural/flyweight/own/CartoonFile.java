package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 动画文件类：具体享元类
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public class CartoonFile extends File {

    public CartoonFile(String key) {
        super(key, "Cartoon");
    }

    @Override
    public String displayType() {
        return "动画";
    }
}

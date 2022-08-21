package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 属性类：外部状态类
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public class Attributes {

    /**
     * 位置, 行
     */
    private int line;

    /**
     * 大小
     */
    private int size;

    public Attributes(int line, int size) {
        this.line = line;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "line=" + line +
                ", size=" + size +
                '}';
    }
}

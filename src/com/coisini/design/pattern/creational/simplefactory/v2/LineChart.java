package com.coisini.design.pattern.creational.simplefactory.v2;

/**
 * @Description 折线图
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class LineChart extends Chart {

    public LineChart() {
        System.out.println("初始化折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}

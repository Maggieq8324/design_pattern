package com.coisini.design.pattern.creational.simplefactory.v2;

/**
 * @Description 柱状图
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class BarChart extends Chart {

    public BarChart () {
        System.out.println("初始化柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}

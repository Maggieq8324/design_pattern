package com.coisini.design.pattern.creational.simplefactory.v3;

/**
 * @Description 饼图
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class PieChart extends Chart {

    public PieChart() {
        System.out.println("初始化饼图");
    }

    @Override
    public void display() {
        System.out.println("显示饼图");
    }
}

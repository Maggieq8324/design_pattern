package com.coisini.design.pattern.creational.simplefactory.v2;

/**
 * @Description 简单工厂测试类
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("line");
        chart.display();
    }

}

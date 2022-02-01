package com.coisini.design.pattern.creational.simplefactory.v3;

/**
 * @Description 简单工厂测试类
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart(BarChart.class);
        if (chart == null) {
            return;
        }
        chart.display();

        chart = ChartFactory.getChart(PieChart.class);
        if (chart == null) {
            return;
        }
        chart.display();
    }

}

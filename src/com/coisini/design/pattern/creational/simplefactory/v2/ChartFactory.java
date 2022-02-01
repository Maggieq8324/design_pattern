package com.coisini.design.pattern.creational.simplefactory.v2;

/**
 * @Description 图表工厂,简单工厂模式
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("bar")) {
            chart = new BarChart();
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }

        return chart;
    }

}

package com.coisini.design.pattern.creational.simplefactory.v3;

/**
 * @Description 图表工厂
 * @author coisini
 * @date Jan 18, 2021
 * @version 1.0
 */
public class ChartFactory {

    /**
     * 获取图表
     * 利用反射从一定程度上满足开闭原则
     * @param c
     * @return
     */
    public static Chart getChart(Class c) {
        Chart chart = null;
        try {
            chart = (Chart) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return chart;
    }

}

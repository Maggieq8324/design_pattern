package com.coisini.design.pattern.creational.simplefactory.v1;

/**
 * @Description 图表库的设计，初始方案一
 * @author coisini
 * @date Feb 1, 2022
 * @version 1.0
 */
public class Chart {

    /**
     * 图表类型
     */
    private String type;

    /**
     * 初始化图表
     * @param type
     */
    public Chart(String type) {
        this.type = type;
        if (type.equalsIgnoreCase("bar")) {
            System.out.println("初始化柱状图");
        } else if (type.equalsIgnoreCase("pie")) {
            System.out.println("初始化饼图");
        } else if (type.equalsIgnoreCase("line")) {
            System.out.println("初始化折线图");
        }
    }

    /**
     * 显示图表
     * @param type
     */
    public void display() {
        if (this.type.equalsIgnoreCase("bar")) {
            System.out.println("显示柱状图");
        } else if (this.type.equalsIgnoreCase("pie")) {
            System.out.println("显示饼图");
        } else if (this.type.equalsIgnoreCase("line")) {
            System.out.println("显示折线图");
        }
    }

}

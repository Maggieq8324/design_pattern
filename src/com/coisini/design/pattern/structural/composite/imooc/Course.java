package com.coisini.design.pattern.structural.composite.imooc;

/**
 * @Description 课程
 * @Author coisini
 * @Date Aug 30, 2022
 * @Version 1.0
 */
public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course name:" + name + " Price:" + price);
    }
}

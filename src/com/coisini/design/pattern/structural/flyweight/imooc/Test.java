package com.coisini.design.pattern.structural.flyweight.imooc;

/**
 * @Description 享元模式测试类
 * @Author coisini
 * @Date Aug 8, 2022
 * @Version 1.0
 */
public class Test {

    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}

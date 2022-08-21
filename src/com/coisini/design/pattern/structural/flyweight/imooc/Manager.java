package com.coisini.design.pattern.structural.flyweight.imooc;

/**
 * @Description 部门经理
 * @Author coisini
 * @Date Aug 8, 2022
 * @Version 1.0
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}

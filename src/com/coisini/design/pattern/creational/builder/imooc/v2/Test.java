package com.coisini.design.pattern.creational.builder.imooc.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式").buildCoursePPT("Java设计模式PPT").build();
        System.out.println(course);
    }
}

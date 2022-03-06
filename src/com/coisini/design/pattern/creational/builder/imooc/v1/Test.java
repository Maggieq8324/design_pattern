package com.coisini.design.pattern.creational.builder.imooc.v1;

/**
 * @Description 建造者模式测试类
 * @author coisini
 * @date Mar 5, 2022
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT",
                "Java设计模式视频", "Java设计模式手记",
                "Java设计模式问答");

        System.out.println(course);
    }
}

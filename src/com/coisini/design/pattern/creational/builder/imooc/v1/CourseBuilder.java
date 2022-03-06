package com.coisini.design.pattern.creational.builder.imooc.v1;

/**
 * @Description 课程抽象建造者
 * @author coisini
 * @date Mar 5， 2022
 * @Version 1.0
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}

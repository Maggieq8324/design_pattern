package com.coisini.design.principle.singleresponsibility;

/**
 * @Description 课程实现类
 * @author coisini
 * @date Dec 6, 2021
 * @Version 1.0
 */
public class CourseImpl implements ICourseContent, ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}

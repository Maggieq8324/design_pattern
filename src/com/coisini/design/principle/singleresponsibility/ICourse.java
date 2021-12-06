package com.coisini.design.principle.singleresponsibility;

/**
 * @Description 课程
 * @author coisini
 * @date Dec 6， 2021
 * @Version 1.0
 */
public interface ICourse {

    /**
     * 获取课程名称
     */
    String getCourseName();

    /**
     * 获取课程视频
     */
    byte[] getCourseVideo();

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退课
     */
    void refundCourse();

}

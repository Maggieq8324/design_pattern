package com.coisini.design.principle.singleresponsibility;

/**
 * @Description 课程内容
 * @author coisini
 * @date Dec 6, 2021
 * @Version 1.0
 */
public interface ICourseContent {

    /**
     * 获取课程名称
     */
    String getCourseName();

    /**
     * 获取课程视频
     */
    byte[] getCourseVideo();

}

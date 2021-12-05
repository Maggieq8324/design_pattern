package com.coisini.design.principle.dependenceinversion;

/**
 * @Description 课程学习
 * @author coisini
 * @date Dec 3, 12
 * @version 1.0
 */
public class Coisini {

    // v1 高层模块依赖底层模块
//    public void studyJavaCourse() {
//        System.out.println("在学习Java课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("在学习Python课程");
//    }

    // v2 面向接口编程
//    public void studyImoocCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }


    // v3 setter注入
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /**
     * 学习课程
     */
    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

}

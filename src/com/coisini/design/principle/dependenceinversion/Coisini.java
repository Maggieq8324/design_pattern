package com.coisini.design.principle.dependenceinversion;

public class Coisini {

    // 高层模块依赖底层模块
//    public void studyJavaCourse() {
//        System.out.println("在学习Java课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("在学习Python课程");
//    }

    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

}

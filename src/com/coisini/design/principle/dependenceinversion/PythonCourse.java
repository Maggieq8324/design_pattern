package com.coisini.design.principle.dependenceinversion;

/**
 * @Description Python课程
 * @author coisini
 * @date Dec 3, 2021
 * @version 1.0
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("在学习Python课程");
    }
}

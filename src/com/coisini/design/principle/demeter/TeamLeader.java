package com.coisini.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 项目经理
 * @author coisini
 * @date Dec 7, 2021
 * @version 1.0
 */
public class TeamLeader {

    /**
     * 课程数量
     * @param courseList
     */
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        System.out.println("在线课程的数量是：" + courseList.size());
    }

}

package com.coisini.design.principle.demeter;

/**
 * @Description Boss
 * @author coisini
 * @date Dec 7, 2021
 * @version 1.0
 */
public class Boss {

    /**
     * 课程数量指令
     * @param teamLeader
     */
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }

}

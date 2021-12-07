package com.coisini.design.principle.demeter;

/**
 * @Description 迪米特法则测试类
 * @author coisini
 * @date Dec 7, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        // TODO 向Leader发送指令获取课程数
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}

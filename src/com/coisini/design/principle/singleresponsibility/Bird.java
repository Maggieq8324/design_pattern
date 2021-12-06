package com.coisini.design.principle.singleresponsibility;

/**
 * @Description 鸟
 * @author coisini
 * @date Dec 6, 2021
 * @Version 1.0
 */
public class Bird {

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }

}

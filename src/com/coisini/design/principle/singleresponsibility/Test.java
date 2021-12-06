package com.coisini.design.principle.singleresponsibility;

/**
 * @Description 单一原则测试类
 * @author coisini
 * @date Dec 6, 2021
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }

}

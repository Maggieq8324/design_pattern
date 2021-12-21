package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description 工厂方法测试类
 * @author Coisini
 * @date Dec 22, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        videoFactory = new JavaVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
    }

}

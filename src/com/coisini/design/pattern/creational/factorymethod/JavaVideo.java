package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description Java课程
 * @author Coisini
 * @date Dec 22, 2021
 * @version 1.0
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}

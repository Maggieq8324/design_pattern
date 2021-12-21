package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description Python课程
 * @author Coisini
 * @date Dec 22, 2021
 * @version 1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}

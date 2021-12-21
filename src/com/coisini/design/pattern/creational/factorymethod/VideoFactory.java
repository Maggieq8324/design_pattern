package com.coisini.design.pattern.creational.factorymethod;

/**
 * @Description Video工厂
 *  只定义规范，并不决定产生哪一种类，产生哪一种类由子类实现
 * @author Coisini
 * @date Dec 22, 2021
 * @version 1.0
 */
public abstract class VideoFactory {

    /**
     * 获取Video
     * @return
     */
    public abstract Video getVideo();

}

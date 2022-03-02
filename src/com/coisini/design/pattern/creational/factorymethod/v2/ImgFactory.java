package com.coisini.design.pattern.creational.factorymethod.v2;

/**
 * @Description 图片工厂类（工厂方法模式）
 * @author coisini
 * @date Feb 22, 2021
 * @version 1.0
 */
public interface ImgFactory {

    /**
     * 获取图片产品类
     * @return
     */
    Img getImg();

}

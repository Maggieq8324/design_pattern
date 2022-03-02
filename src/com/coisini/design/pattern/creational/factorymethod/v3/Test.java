package com.coisini.design.pattern.creational.factorymethod.v3;

import com.coisini.design.util.PropertiesUtil;

/**
 * @Description 工厂方法模式测试类（配置文件反射实现方式）
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ImgFactory imgFactory = (ImgFactory) PropertiesUtil.getFactoryMethodBean();
        Img img = imgFactory.getImg();
        img.getSource();
    }

}

package com.coisini.design.pattern.creational.factorymethod.v1;

/**
 * @Description 图片简单工厂测试类
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Img img = ImgFactory.getImg("gif");
        if (img == null) {
            return;
        }
        img.getSource();

        img = ImgFactory.getImg("jpg");
        if (img == null) {
            return;
        }
        img.getSource();
    }

}

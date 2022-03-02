package com.coisini.design.pattern.creational.factorymethod.v1;

/**
 * @Description GIF图片
 * @author coisini
 * @date Feb 11, 2022
 * @version 1.0
 */
public class GifImg extends Img {

    @Override
    public void getSource() {
        System.out.println("获取GIF图片源");
    }

}

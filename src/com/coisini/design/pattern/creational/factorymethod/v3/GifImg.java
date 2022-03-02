package com.coisini.design.pattern.creational.factorymethod.v3;

/**
 * @Description GIF图片产品类
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class GifImg extends Img {

    @Override
    public void getSource() {
        System.out.println("获取GIF图片源");
    }

}

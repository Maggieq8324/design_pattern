package com.coisini.design.pattern.creational.factorymethod.v1;

/**
 * @Description JPG图片
 * @author coisini
 * @date Feb 11, 2022
 * @version 1.0
 */
public class JpgImg extends Img {

    @Override
    public void getSource() {
        System.out.println("获取JPG图片源");
    }

}

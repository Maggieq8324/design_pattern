package com.coisini.design.pattern.creational.factorymethod.v2;

/**
 * @Description JPG图片产品类
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class JpgImg extends Img {

    @Override
    public void getSource() {
        System.out.println("获取JPG图片源");
    }

}

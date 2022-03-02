package com.coisini.design.pattern.creational.factorymethod.v2;

/**
 * @Description 工厂方法模式测试类
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ImgFactory imgFetchFactory = new GifImgFactory();
        Img imgFetch = imgFetchFactory.getImg();
        imgFetch.getSource();

        imgFetchFactory = new JpgImgFactory();
        imgFetch = imgFetchFactory.getImg();
        imgFetch.getSource();
    }

}

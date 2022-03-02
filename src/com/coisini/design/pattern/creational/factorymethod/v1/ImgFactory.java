package com.coisini.design.pattern.creational.factorymethod.v1;

/**
 * @Description 图片简单工厂类
 * @author coisini
 * @date Feb 11, 2021
 * @version 1.0
 */
public class ImgFactory {

    /**
     * 获取图片读取器
     * @param args
     * @return
     */
    public static Img getImg(String args) {
        Img img = null;

        if (args.equalsIgnoreCase("gif")) {
            img = new GifImg();
        } else if (args.equalsIgnoreCase("jpg")) {
            img = new JpgImg();
        }

        return img;
    }

}

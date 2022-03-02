package com.coisini.design.pattern.creational.factorymethod.v3;

/**
 * @Description Gif图片工厂类
 * @author coisini
 * @date Feb 22, 2022
 * @version 1.0
 */
public class GifImgFactory implements ImgFactory {

    @Override
    public Img getImg() {
        return new GifImg();
    }

}

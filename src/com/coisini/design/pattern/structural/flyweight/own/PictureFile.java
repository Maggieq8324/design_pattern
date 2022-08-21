package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 图片文件类：具体享元类
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public class PictureFile extends File {

    public PictureFile(String key) {
        super(key, "Picture");
    }

    @Override
    public String displayType() {
        return "图片";
    }
}

package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 视频文件类：具体享元类
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public class VideoFile extends File {

    public VideoFile(String key) {
        super(key, "Video");
    }

    @Override
    public String displayType() {
        return "视频";
    }

}

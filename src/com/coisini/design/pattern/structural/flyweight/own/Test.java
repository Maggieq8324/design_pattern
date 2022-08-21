package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 享元模式测试类
 * @Author coisini
 * @Date Aug 21, 2022
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();

        // 在各位置插入同一张图片，且大小不同
        File pictureFile = new PictureFile("123");
        documentEditor.insertFile(pictureFile, new Attributes(10, 100));
        documentEditor.insertFile(pictureFile, new Attributes(20, 200));
        documentEditor.insertFile(pictureFile, new Attributes(30, 300));

        // 插入另一张图片
        pictureFile.setKey("456");
        documentEditor.insertFile(pictureFile, new Attributes(40, 100));

        // 插入视频
        File video = new VideoFile("789");
        documentEditor.insertFile(video, new Attributes(50, 100));

        // 文档打印
        documentEditor.display();
    }

}

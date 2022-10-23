package com.coisini.design.pattern.structural.bridge.book;

// 桥接模式测试类
public class Test {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImp imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}

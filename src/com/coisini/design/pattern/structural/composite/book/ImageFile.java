package com.coisini.design.pattern.structural.composite.book;

//图像文件类：叶子构件
public class ImageFile extends AbstractFile {
    private final String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}


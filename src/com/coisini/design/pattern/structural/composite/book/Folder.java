package com.coisini.design.pattern.structural.composite.book;

import java.util.ArrayList;

//文件夹类：容器构件
public class Folder extends AbstractFile {
    //定义集合fileList，用于存储AbstractFile类型的成员
    private final ArrayList<AbstractFile> fileList = new ArrayList<>();
    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for(AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
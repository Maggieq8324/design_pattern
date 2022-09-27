package com.coisini.design.pattern.structural.composite.book;

//文本文件类：叶子构件
public class TextFile extends AbstractFile {
    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
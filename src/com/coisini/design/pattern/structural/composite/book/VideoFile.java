package com.coisini.design.pattern.structural.composite.book;

//视频文件类：叶子构件
public
class VideoFile extends AbstractFile {
    private final String name;

    public VideoFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        //模拟杀毒
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}

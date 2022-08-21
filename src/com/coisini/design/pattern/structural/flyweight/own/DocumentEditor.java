package com.coisini.design.pattern.structural.flyweight.own;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 文档编辑器
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public class DocumentEditor {

    List<EditorFile> editorFileList = new ArrayList<>();

    /**
     * 插入文件
     * @param file 文件
     * @param attributes 属性
     */
    public void insertFile(File file, Attributes attributes) {
        EditorFile editorFile = new EditorFile(FileFactory.getFile(file.getKey(), file.getType()), attributes);
        editorFileList.add(editorFile);
    }

    /**
     * 文档打印
     */
    public void display() {
        System.out.println("文档编辑器：");
        editorFileList.forEach(System.out::println);

        System.out.println("\n享元工厂：");
        FileFactory.display();
    }

}

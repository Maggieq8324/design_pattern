package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 编辑器文件
 * @Author coisini
 * @Date Aug 21, 2022
 * @Version 1.0
 */
public class EditorFile {

    private final File file;

    private final Attributes attributes;

    public EditorFile(File file, Attributes attributes) {
        this.file = file;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "EditorFile{" +
                "abstractFile=" + file +
                ", attributes=" + attributes +
                '}';
    }
}

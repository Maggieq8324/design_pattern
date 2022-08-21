package com.coisini.design.pattern.structural.flyweight.own;

/**
 * @Description 文件抽象类： 抽象享元类
 * @Author coisini
 * @Date Aug 13, 2022
 * @Version 1.0
 */
public abstract class File {

    private String key;

    private final String type;

    public File(String key, String type) {
        this.key = key;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract String displayType();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "File{" +
                "key='" + key + '\'' +
                ", type='" + displayType() + '\'' +
                '}';
    }
}

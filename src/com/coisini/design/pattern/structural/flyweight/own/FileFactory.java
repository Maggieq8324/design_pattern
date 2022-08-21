package com.coisini.design.pattern.structural.flyweight.own;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 文件工厂类：享元工厂类
 * @Author coisini
 * @Date Aug 21, 2022
 * @Version 1.0
 */
public class FileFactory {

    private static final Map<String, File> FILE_MAP = new HashMap<>();

    /**
     * 通过key来获取存储在HashMap中的享元对象
     */
    public static File getFile(String key, String type) {
        File file = FILE_MAP.get(key);

        if (file == null) {
            if ("Picture".equalsIgnoreCase(type)) {
                file = new PictureFile(key);
            } else if ("Video".equalsIgnoreCase(type)) {
                file = new VideoFile(key);
            } else if ("Cartoon".equalsIgnoreCase(type)) {
                file = new CartoonFile(key);
            }
            FILE_MAP.put(file.getKey(), file);
        }

        return file;
    }

    /**
     * 打印
     */
    public static void display() {
        FILE_MAP.forEach((key, value)-> {
            System.out.println("key:" + key + ", value:" + value);
        });
    }

}

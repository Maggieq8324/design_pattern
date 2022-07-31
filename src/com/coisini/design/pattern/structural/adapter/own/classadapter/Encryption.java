package com.coisini.design.pattern.structural.adapter.own.classadapter;

/**
 * @Description 加密类：适配者
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class Encryption {

    /**
     * 加密
     * @param str 加密字符
     * @return 加密后的字符
     */
    public String encrypt(String str) {
        // TODO 假设为加密方法
        return "***** " + str + " *****";
    }

}

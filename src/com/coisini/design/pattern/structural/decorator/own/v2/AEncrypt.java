package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description 抽象加密构建类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public abstract class AEncrypt {

    /**
     * 加密
     * @param str
     * @return
     */
    public abstract String encrypt(String str);

}

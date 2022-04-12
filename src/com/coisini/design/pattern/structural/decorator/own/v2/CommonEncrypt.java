package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description 常规加密具体构建类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class CommonEncrypt extends AEncrypt {
    @Override
    public String encrypt(String str) {
        return str + " 常规加密";
    }
}

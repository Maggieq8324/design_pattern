package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description MD5加密具体装饰类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class MD5Decorator extends EncryptDecorator {

    public MD5Decorator(AEncrypt aEncrypt) {
        super(aEncrypt);
    }

    @Override
    public String encrypt(String str) {
        return super.encrypt(str) + " MD5加密";
    }
}

package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description RSA加密具体装饰类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class RSADecorator extends EncryptDecorator {

    public RSADecorator(AEncrypt aEncrypt) {
        super(aEncrypt);
    }

    @Override
    public String encrypt(String str) {
        return super.encrypt(str) + " RSA加密";
    }
}

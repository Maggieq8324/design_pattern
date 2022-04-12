package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description AES加密具体装饰类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class AESDecorator extends EncryptDecorator {

    public AESDecorator(AEncrypt aEncrypt) {
        super(aEncrypt);
    }

    @Override
    public String encrypt(String str) {
        // TODO 调用原有业务方法 + 扩展新功能
        return super.encrypt(str) + " AES加密";
    }
}

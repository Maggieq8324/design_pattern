package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description 抽象构建装饰类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public abstract class EncryptDecorator extends AEncrypt {

    // TODO 维持一个对抽象构件对象的引用
    private AEncrypt aEncrypt;

    // TODO 注入一个抽象构件类型的对象
    public EncryptDecorator(AEncrypt aEncrypt) {
        this.aEncrypt = aEncrypt;
    }

    @Override
    public String encrypt(String str) {
        // TODO 调用原有业务方法
        return aEncrypt.encrypt(str);
    }
}

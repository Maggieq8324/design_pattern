package com.coisini.design.pattern.structural.decorator.own.v1;

/**
 * @Description AES加密
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class AESEncrypt extends Encrypt {

    @Override
    public String encrypt(String str) {
        return super.encrypt(str) + " AES加密";
    }
}

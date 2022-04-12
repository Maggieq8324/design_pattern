package com.coisini.design.pattern.structural.decorator.own.v1;

/**
 * @Description 测试类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        System.out.println(encrypt.encrypt("encrypt data"));

        MD5Encrypt md5Encrypt = new MD5Encrypt();
        System.out.println(md5Encrypt.encrypt("encrypt data"));

        AESEncrypt aesEncrypt = new AESEncrypt();
        System.out.println(aesEncrypt.encrypt("encrypt data"));

        RSAEncrypt rsaEncrypt = new RSAEncrypt();
        System.out.println(rsaEncrypt.encrypt("encrypt data"));
    }

}

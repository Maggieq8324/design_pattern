package com.coisini.design.pattern.structural.decorator.own.v2;

/**
 * @Description 装饰模式测试类
 * @author coisini
 * @date Apr 12, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 常规加密
         */
        AEncrypt aEncrypt = new CommonEncrypt();
        System.out.println(aEncrypt.encrypt("encrypt data"));

        /**
         * MD5加密
         */
        aEncrypt = new MD5Decorator(aEncrypt);
        System.out.println(aEncrypt.encrypt("encrypt data"));

        /**
         * RSA加密
         */
        aEncrypt = new RSADecorator(aEncrypt);
        System.out.println(aEncrypt.encrypt("encrypt data"));

        /**
         * AES加密
         */
        aEncrypt = new AESDecorator(aEncrypt);
        System.out.println(aEncrypt.encrypt("encrypt data"));
    }

}

package com.coisini.design.pattern.structural.adapter.imooc.example;

/**
 * @Description 手机充电器适配示例
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }

}

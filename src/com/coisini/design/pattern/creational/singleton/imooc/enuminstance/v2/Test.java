package com.coisini.design.pattern.creational.singleton.imooc.enuminstance.v2;

/**
 * @Description 枚举类申明方法测试类
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.getInstance();
        instance.hello();
    }
}

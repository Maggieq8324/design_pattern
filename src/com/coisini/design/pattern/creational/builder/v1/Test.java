package com.coisini.design.pattern.creational.builder.v1;

/**
 * @Description 建造者模式测试类
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ModeBuilder modeBuilder = new FullModeBuilder();
        System.out.println(modeBuilder.construct());

        modeBuilder = new SimplyModeBuilder();
        System.out.println(modeBuilder.construct());

        modeBuilder = new MemoryModeBuilder();
        System.out.println(modeBuilder.construct());
    }
}

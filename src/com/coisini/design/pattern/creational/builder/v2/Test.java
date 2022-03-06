package com.coisini.design.pattern.creational.builder.v2;

import com.coisini.design.util.PropertiesUtil;

/**
 * @Description 建造者模式测试类（配置文件反射实现方式）
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ModeBuilder modeBuilder = (ModeBuilder) PropertiesUtil.getBuilderPatternBean();
        System.out.println(modeBuilder.construct());
    }
}

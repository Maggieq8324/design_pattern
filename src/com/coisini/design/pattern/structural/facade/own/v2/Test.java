package com.coisini.design.pattern.structural.facade.own.v2;

/**
 * @Description 外观模式测试类（配置文件反射实现方式）
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BackUpFacade backUpFacade = new BackUpFacade();
        backUpFacade.unifiedBackUp();
    }
}

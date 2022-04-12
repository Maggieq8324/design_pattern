package com.coisini.design.pattern.structural.decorator.imooc.v2;

/**
 * @Description 煎饼
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class BatterCake extends ABatterCake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }

}

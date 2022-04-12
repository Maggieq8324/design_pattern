package com.coisini.design.pattern.structural.decorator.imooc.v1;

/**
 * @Description 加蛋的煎饼
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个煎蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

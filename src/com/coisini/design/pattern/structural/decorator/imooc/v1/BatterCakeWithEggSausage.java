package com.coisini.design.pattern.structural.decorator.imooc.v1;

/**
 * @Description 加香肠加煎蛋的煎饼
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

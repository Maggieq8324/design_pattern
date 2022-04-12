package com.coisini.design.pattern.structural.decorator.imooc.v2;

/**
 * @Description 煎蛋装饰者
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void doSomeThing() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个煎蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}

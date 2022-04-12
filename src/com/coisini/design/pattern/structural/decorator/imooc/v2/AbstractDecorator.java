package com.coisini.design.pattern.structural.decorator.imooc.v2;

/**
 * @Description 抽象装饰者
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public abstract class AbstractDecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    protected abstract void doSomeThing();

    @Override
    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return aBatterCake.cost();
    }
}

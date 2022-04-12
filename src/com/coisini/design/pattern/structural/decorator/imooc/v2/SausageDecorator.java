package com.coisini.design.pattern.structural.decorator.imooc.v2;

/**
 * @Description 香肠装饰者
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void doSomeThing() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

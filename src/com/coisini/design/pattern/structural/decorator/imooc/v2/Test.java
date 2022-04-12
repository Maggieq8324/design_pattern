package com.coisini.design.pattern.structural.decorator.imooc.v2;

/**
 * @Description 装饰者模式测试类
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();

        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + " 价格：" + aBatterCake.cost());
    }

}

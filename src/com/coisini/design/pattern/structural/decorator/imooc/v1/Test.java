package com.coisini.design.pattern.structural.decorator.imooc.v1;

/**
 * @Description 测试类
 * @author coisini
 * @date Apr 8, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 价格：" + batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 价格：" + batterCakeWithEgg.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 价格：" + batterCakeWithEggSausage.cost());

        // 此处对于用户想要再多加香肠和鸡蛋的行为无法实现

    }

}

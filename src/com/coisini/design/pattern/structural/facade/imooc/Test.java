package com.coisini.design.pattern.structural.facade.imooc;

/**
 * @Description 外观模式测试类
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}

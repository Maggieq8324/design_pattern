package com.coisini.design.pattern.structural.facade.imooc;

/**
 * @Description 物流子系统
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        // TODO 物流系统对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        // 物流单号
        return "666666";
    }

}

package com.coisini.design.pattern.structural.facade.imooc;

/**
 * @Description 积分支付子系统
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // TODO 扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }

}

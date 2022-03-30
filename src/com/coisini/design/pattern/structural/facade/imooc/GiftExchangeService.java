package com.coisini.design.pattern.structural.facade.imooc;

/**
 * @Description 礼物兑换服务
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                // 积分支付成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
            }
        }
    }

}

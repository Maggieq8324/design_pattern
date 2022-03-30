package com.coisini.design.pattern.structural.facade.imooc;

/**
 * @Description 资格检验子系统
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过");
        return true;
    }

}

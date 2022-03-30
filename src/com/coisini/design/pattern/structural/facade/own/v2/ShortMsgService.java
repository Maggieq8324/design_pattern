package com.coisini.design.pattern.structural.facade.own.v2;

/**
 * @Description 短信子系统
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class ShortMsgService extends AbstractService {

    @Override
    public void backUp() {
        System.out.println("短信备份成功");
    }

}

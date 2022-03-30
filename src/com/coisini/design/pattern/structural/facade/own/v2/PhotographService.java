package com.coisini.design.pattern.structural.facade.own.v2;

/**
 * @Description 照片子系统
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class PhotographService extends AbstractService {

    @Override
    public void backUp() {
        System.out.println("照片备份成功");
    }

}

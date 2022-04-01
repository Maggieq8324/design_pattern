package com.coisini.design.pattern.structural.facade.own.v3;

import com.coisini.design.pattern.structural.facade.own.v2.AbstractService;

/**
 * @Description 通讯录子系统
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class AddressBookService extends AbstractService {

    @Override
    public void backUp() {
        System.out.println("通讯录备份成功");
    }

}

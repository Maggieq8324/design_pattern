package com.coisini.design.pattern.structural.facade.own.v3;

import com.coisini.design.util.PropertiesUtil;

/**
 * @Description 外观模式测试类（抽象外观类）
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractFacade backUpFacade = (AbstractFacade) PropertiesUtil.getFacadePatternBean();
        backUpFacade.unifiedBackUp();
    }
}

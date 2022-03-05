package com.coisini.design.pattern.creational.abstractfactory.v2;

/**
 * @Description IOS操作界面产品类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class IOSSurface extends Surface {
    @Override
    public void init() {
        System.out.println("初始化IOS操作界面");
    }
}

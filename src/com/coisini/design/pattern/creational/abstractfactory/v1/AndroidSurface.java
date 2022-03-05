package com.coisini.design.pattern.creational.abstractfactory.v1;

/**
 * @Description Android操作界面产品类
 * @author coisini
 * @date Mar 4, 2022
 * @version 1.0
 */
public class AndroidSurface extends Surface {
    @Override
    public void init() {
        System.out.println("初始化Android操作界面");
    }
}

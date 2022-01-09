package com.coisini.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 子类
 * @author Coisini
 * @date Jan 10, 2021
 * @version 1.0
 */
public class Child extends Base {

    /**
     * 重写
     */
    @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行");
    }

    /**
     * 重载
     */
    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }

}

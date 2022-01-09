package com.coisini.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Description 基类
 * @author Coisini
 * @date Jan 10, 2021
 * @version 1.0
 */
public class Base {

    public void method(HashMap map) {
        System.out.println("父类被执行");
    }

}

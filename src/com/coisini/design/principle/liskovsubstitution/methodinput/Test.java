package com.coisini.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Description 测试类
 * @author Coisini
 * @date Jan 10, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }

}

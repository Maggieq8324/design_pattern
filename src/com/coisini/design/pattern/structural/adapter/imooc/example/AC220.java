package com.coisini.design.pattern.structural.adapter.imooc.example;

/**
 * @Description 220V交流电(被适配者)
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }

}

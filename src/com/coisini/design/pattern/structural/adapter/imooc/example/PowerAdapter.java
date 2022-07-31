package com.coisini.design.pattern.structural.adapter.imooc.example;

/**
 * @Description 电源适配器
 * @author coisini
 * @date Jun 5, 2022
 * @version 1.0
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器...
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入AC:" + adapterInput+"V"+"输出直流电DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}

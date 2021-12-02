package com.coisini.design.principle.openclose;

/**
 * @Description java折扣
 * @author coisini
 * @date Aug 27, 2021
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 原价
     * @return
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    /**
     * add 打折场景
     * 折扣价
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}

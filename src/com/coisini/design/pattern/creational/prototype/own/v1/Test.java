package com.coisini.design.pattern.creational.prototype.own.v1;

/**
 * @Description 原型模式测试类
 * @author coisini
 * @date Mar 24, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer();
        customer.setName("张三");
        customer.setAddress("四川省成都市");
        System.out.println(customer);

        Customer customerClone = (Customer) customer.clone();
        customerClone.setAddress("浙江省杭州市");
        System.out.println(customerClone);
    }
}

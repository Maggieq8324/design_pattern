package com.coisini.design.pattern.creational.prototype.own.v4;

/**
 * @Description 序列化实现深克隆测试类
 * @author coisini
 * @date Mar 28, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setName("张三");
        customer.setAddress(new Address("四川省", "成都市"));
        System.out.println(customer);

        Customer customerClone = customer.deepClone();
        System.out.println(customerClone);

        System.out.println(customer == customerClone);

        System.out.println("--------------");

        customer.getAddress().setProvince("浙江省");
        customer.getAddress().setCity("杭州市");

        System.out.println(customer);
        System.out.println(customerClone);
        System.out.println(customer == customerClone);

    }
}

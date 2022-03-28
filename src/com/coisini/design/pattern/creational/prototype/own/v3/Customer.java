package com.coisini.design.pattern.creational.prototype.own.v3;

/**
 * @Description 客户
 * @author coisini
 * @date Mar 24, 2022
 * @version 1.0
 */
public class Customer implements Cloneable {

    private String name;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * 深克隆方式一  对于引用类型单独克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer customer = (Customer) super.clone();
        customer.address = (Address) customer.address.clone();
        return customer;
    }
}

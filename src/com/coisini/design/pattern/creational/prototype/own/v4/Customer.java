package com.coisini.design.pattern.creational.prototype.own.v4;

import java.io.*;

/**
 * @Description 客户
 * @author coisini
 * @date Mar 24, 2022
 * @version 1.0
 */
public class Customer implements Serializable {

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
     * 深克隆方式二 序列化
     * @return
     */
    public Customer deepClone() throws Exception {
        // TODO 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oss = new ObjectOutputStream(bao);
        oss.writeObject(this);

        // TODO 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Customer) ois.readObject();
    }
}

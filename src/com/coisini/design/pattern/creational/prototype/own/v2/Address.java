package com.coisini.design.pattern.creational.prototype.own.v2;

/**
 * @Description 地址
 * @author coisini
 * @date Mar 24, 2022
 * @version 1.0
 */
public class Address {

    private String province;

    private String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

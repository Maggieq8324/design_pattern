package com.coisini.design.pattern.creational.singleton.imooc.enuminstance.v1;

/**
 * @Description Enum枚举单例
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}

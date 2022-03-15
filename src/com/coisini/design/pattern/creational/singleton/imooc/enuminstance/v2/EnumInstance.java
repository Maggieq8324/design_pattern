package com.coisini.design.pattern.creational.singleton.imooc.enuminstance.v2;

/**
 * @Description Enum枚举单例
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public enum EnumInstance {
    INSTANCE {
        /**
         * 枚举类中申明方法
         */
        protected void hello() {
            System.out.println("Hello World!");
        }
    };

    protected abstract void hello();

    private static Object data;

    public static Object getData() {
        return data;
    }

    public static void setData(Object data) {
        EnumInstance.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}

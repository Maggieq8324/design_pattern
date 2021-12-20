package com.coisini.design.principle.compositionaggregation;

/**
 * @Description DB连接
 * @author Coisini
 * @date Dec 19, 2021
 * @version 1.0
 */
public abstract class DBConnection {

    /**
     * 获取DB连接
     * @return
     */
//    public String getConnection() {
//        return "Mysql数据库连接";
//    }

    /**
     * 获取DB连接
     * @return
     */
    public abstract String getConnection();

}

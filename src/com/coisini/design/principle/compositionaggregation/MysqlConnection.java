package com.coisini.design.principle.compositionaggregation;

/**
 * @Description Mysql连接
 * @author Coisini
 * @date Dec 20, 2021
 * @version 1.0
 */
public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Mysql数据库连接";
    }
}

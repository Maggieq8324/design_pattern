package com.coisini.design.principle.compositionaggregation;

/**
 * @Description Oracle连接
 * @author Coisini
 * @date Dec 20, 2021
 * @version 1.0
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}

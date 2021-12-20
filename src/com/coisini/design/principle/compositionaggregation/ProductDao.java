package com.coisini.design.principle.compositionaggregation;

/**
 * @Description 产品DAO
 * @author Coisini
 * @date Dec 19, 2021
 * @version 1.0
 */
//public class ProductDao extends DBConnection {
//
//    /**
//     * 添加产品
//     */
//    public void addProduct() {
//        String conn = super.getConnection();
//        System.out.println("使用" + conn + "增加产品");
//    }
//
//}

// v2 合成复用原则
public class ProductDao {

    private DBConnection dbConnection;

    /**
     * setter注入
     * @param dbConnection
     */
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    /**
     * 添加产品
     */
    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }

}

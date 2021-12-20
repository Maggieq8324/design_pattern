package com.coisini.design.principle.compositionaggregation;

/**
 * @Description 合成复用原则测试类
 * @author Coisini
 * @date Dec 19, 2021
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        // v1
//        ProductDao productDao = new ProductDao();
//        productDao.addProduct();

        // v2
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();

        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }

}

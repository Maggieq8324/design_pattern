package com.coisini.design.pattern.structural.bridge.own;

/**
 * @Description Oracle数据库实现类：具体实现类
 * @Author coisini
 * @Date Oct 23, 2022
 * @Version 1.0
 */
public class OracleDB implements DB {

    @Override
    public void export() {
        System.out.print("获取Oracle数据 ");
    }

}

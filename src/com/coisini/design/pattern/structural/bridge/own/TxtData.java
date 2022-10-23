package com.coisini.design.pattern.structural.bridge.own;

/**
 * @Description TXT格式数据：扩充抽象类
 * @Author coisini
 * @Date Oct 23, 2022
 * @Version 1.0
 */
public class TxtData extends Data {

    public TxtData(DB db) {
        super(db);
    }

    @Override
    public void export() {
        db.export();
        System.out.println("导出格式为TXT");
    }
}

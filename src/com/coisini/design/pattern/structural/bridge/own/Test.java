package com.coisini.design.pattern.structural.bridge.own;

/**
 * @Description 桥接模式测试类
 * @Author coisini
 * @Date Oct 23, 2022
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Data txtData = new TxtData(new MysqlDB());
        txtData.export();

        Data pdfData = new PdfData(new MysqlDB());
        pdfData.export();

        Data xmlData = new XmlData(new OracleDB());
        xmlData.export();
    }
}

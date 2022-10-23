package com.coisini.design.pattern.structural.bridge.imooc;

/**
 * @Description 银行
 * @Author coisini
 * @Date Oct 17, 2022
 * @Version 1.0
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}

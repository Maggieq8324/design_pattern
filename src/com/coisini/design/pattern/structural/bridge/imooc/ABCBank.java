package com.coisini.design.pattern.structural.bridge.imooc;

/**
 * @Description 农业银行
 * @Author coisini
 * @Date Oct 17, 2022
 * @Version 1.0
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}

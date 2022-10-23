package com.coisini.design.pattern.structural.bridge.imooc;

/**
 * @Description 工商银行
 * @Author coisini
 * @Date Oct 17, 2022
 * @Version 1.0
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}

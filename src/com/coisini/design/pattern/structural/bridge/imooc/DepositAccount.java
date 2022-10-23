package com.coisini.design.pattern.structural.bridge.imooc;

/**
 * @Description 定期账号
 * @Author coisini
 * @Date Oct 17, 2022
 * @Version 1.0
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}

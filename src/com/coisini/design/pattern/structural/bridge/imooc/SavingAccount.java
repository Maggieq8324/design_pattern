package com.coisini.design.pattern.structural.bridge.imooc;

/**
 * @Description 活期账号
 * @Author coisini
 * @Date Oct 17, 2022
 * @Version 1.0
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}

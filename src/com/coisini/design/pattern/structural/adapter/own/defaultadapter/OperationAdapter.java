package com.coisini.design.pattern.structural.adapter.own.defaultadapter;

/**
 * @Description 操作适配器：适配器
 * @Author coisini
 * @Date Jul 31, 2022
 * @Version 1.0
 */
public class OperationAdapter extends AbstractOperation {

    private final Encryption encryption; // 适配者Encryption对象

    public OperationAdapter() {
        this.encryption = new Encryption();
    }

    @Override
    public void save(User user) {
        User encryptUser = new User();
        encryptUser.setToken(encryption.encrypt(user.getToken()));
        encryptUser.setMail(encryption.encrypt(user.getMail()));

        // 调用父类的实现
        super.save(encryptUser);
    }
}

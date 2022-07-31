package com.coisini.design.pattern.structural.adapter.own.objectadapter;

/**
 * @Description 操作适配器：适配器
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class OperationAdapter implements DBOperation {

    // 维持一个对适配者对象的引用
    private final Encryption encryption; // 适配者Encryption对象
    private final DBUtil dbUtil; // 适配者DBUtil对象

    public OperationAdapter() {
        encryption = new Encryption();
        dbUtil = new DBUtil();
    }

    @Override
    public void save(User user) {
        User encryptUser = new User();
        encryptUser.setToken(encryption.encrypt(user.getToken()));
        encryptUser.setMail(encryption.encrypt(user.getMail()));

        // 转发调用适配者类DBUtil的保存方法
        dbUtil.save(encryptUser);
    }
}

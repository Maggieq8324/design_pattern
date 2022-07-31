package com.coisini.design.pattern.structural.adapter.own.classadapter;

/**
 * @Description 操作适配器：适配器
 * @Author coisini
 * @Date Jul 30, 2022
 * @Version 1.0
 */
public class OperationAdapter extends Encryption implements DBOperation {

    private final DBUtil dbUtil; // 适配者DBUtil对象

    public OperationAdapter() {
        this.dbUtil = new DBUtil();
    }

    @Override
    public void save(User user) {
        User encryptUser = new User();
        encryptUser.setToken(super.encrypt(user.getToken()));
        encryptUser.setMail(super.encrypt(user.getMail()));

        // 转发调用适配者类DBUtil的保存方法
        dbUtil.save(encryptUser);
    }
}

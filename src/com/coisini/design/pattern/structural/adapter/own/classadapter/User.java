package com.coisini.design.pattern.structural.adapter.own.classadapter;

/**
 * @Description 用户
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class User {

    private String token;

    private String mail;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "token='" + token + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}

package com.coisini.design.pattern.creational.prototype.imooc.v1;

import java.text.MessageFormat;

/**
 * @Description Mail工具类
 * @author coisini
 * @date Mar 17, 2022
 * @version 1.0
 */
public class MailUtil {
    /**
     * 发送邮件
     * @param mail
     */
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学,邮件地址：{1},邮件内容：{2},发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    /**
     * 存储原始邮件记录
     * @param mail
     */
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,originMail: " + mail.getContent());
    }
}

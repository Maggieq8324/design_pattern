package com.coisini.design.pattern.creational.prototype.imooc.v1;

/**
 * @Description 原型模式测试类
 * @author coisini
 * @date Mar 17, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail: " + mail);

        for (int i = 0; i < 10; i++) {
            // 克隆对象不会调用对象的构造器
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemp.setContent("恭喜你，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("mailTemp: " + mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}

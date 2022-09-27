package com.coisini.design.pattern.structural.composite.own.quondam;

/**
 * @Description 安全组合模式测试类
 * Sunny软件公司欲开发一个界面控件库，界面控件分为两大类，一类是单元控件，例如按钮、文本框等，
 * 一类是容器控件，例如窗体、中间面板等，试用组合模式设计该界面控件库
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        CenterPanel centerPanel = new CenterPanel("中央面板");
        PopWindow popWindow = new PopWindow("弹出窗");

        TextBox textBox = new TextBox("文本框");
        Button button = new Button("按钮");

        popWindow.addTextBox(textBox);
        popWindow.addButton(button);

        centerPanel.addTextBox(textBox);
        centerPanel.addButton(button);
        centerPanel.addPopWindow(popWindow);

        centerPanel.display();
    }

}

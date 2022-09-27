package com.coisini.design.pattern.structural.composite.own.transparent;

/**
 * @Description 透明组合模式测试类
 * Sunny软件公司欲开发一个界面控件库，界面控件分为两大类，一类是单元控件，例如按钮、文本框等，
 * 一类是容器控件，例如窗体、中间面板等，试用组合模式设计该界面控件库
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Component centerPanel = new CenterPanel("中央面板", 1);
        Component popWindow = new PopWindow("弹出窗", 2);

        Component textBox = new TextBox("文本框");
        Component button = new Button("按钮");

        popWindow.add(textBox);
        popWindow.add(button);

        centerPanel.add(textBox);
        centerPanel.add(button);
        centerPanel.add(popWindow);

        centerPanel.display();
    }

}

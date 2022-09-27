package com.coisini.design.pattern.structural.composite.own.quondam;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 容器控件：中间面板
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class CenterPanel {

    private final List<PopWindow> popWindowList = new ArrayList<>();

    private final List<Button> buttonList = new ArrayList<>();

    private final List<TextBox> textBoxList = new ArrayList<>();
    private final String name;

    public CenterPanel(String name) {
        this.name = name;
    }

    public void addPopWindow(PopWindow popWindow) {
        popWindowList.add(popWindow);
    }

    public void addButton(Button button) {
        buttonList.add(button);
    }

    public void addTextBox(TextBox textBox) {
        textBoxList.add(textBox);
    }

    public void display() {
        System.out.println(this.name);
        popWindowList.forEach(PopWindow::display);

        buttonList.forEach(Button::display);

        textBoxList.forEach(TextBox::display);
    }
}

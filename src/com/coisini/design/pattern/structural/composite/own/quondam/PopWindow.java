package com.coisini.design.pattern.structural.composite.own.quondam;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 容器控件：弹出窗口
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class PopWindow {

    private final List<CenterPanel> centerPanelList = new ArrayList<>();

    private final List<Button> buttonList = new ArrayList<>();

    private final List<TextBox> textBoxList = new ArrayList<>();
    private final String name;

    public PopWindow(String name) {
        this.name = name;
    }

    public void addCenterPanel(CenterPanel centerPanel) {
        centerPanelList.add(centerPanel);
    }

    public void addButton(Button button) {
        buttonList.add(button);
    }

    public void addTextBox(TextBox textBox) {
        textBoxList.add(textBox);
    }

    public void display() {
        System.out.println(this.name);
        centerPanelList.forEach(CenterPanel::display);

        buttonList.forEach(Button::display);

        textBoxList.forEach(TextBox::display);
    }
}

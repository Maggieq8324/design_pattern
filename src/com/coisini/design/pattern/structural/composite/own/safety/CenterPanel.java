package com.coisini.design.pattern.structural.composite.own.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 中间面板：容器构件
 * @Author coisini
 * @Date Sep 21, 2022
 * @Version 1.0
 */
public class CenterPanel extends Component {

    private final List<Component> componentList = new ArrayList<>();
    private final String name;
    private final Integer level;

    public CenterPanel(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void display() {
        System.out.println(this.name);
        componentList.forEach(component -> {
            for (int i = 0; i < this.level; i++) {
                System.out.print(" ");
            }
            component.display();
        });
    }
}

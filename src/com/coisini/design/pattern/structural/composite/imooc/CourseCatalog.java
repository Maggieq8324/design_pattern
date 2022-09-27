package com.coisini.design.pattern.structural.composite.imooc;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 课程目录
 * @Author coisini
 * @Date Aug 30, 2022
 * @Version 1.0
 */
public class CourseCatalog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            catalogComponent.print();
        }
    }
}

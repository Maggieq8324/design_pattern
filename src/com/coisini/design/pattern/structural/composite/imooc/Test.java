package com.coisini.design.pattern.structural.composite.imooc;

/**
 * @Description 组合模式测试类
 * @Author coisini
 * @Date Aug 30, 2022
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);

        CatalogComponent mallCourse1 = new Course("电商一期", 55);
        CatalogComponent mallCourse2 = new Course("电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourseCatalog.add(mallCourse1);
        javaCourseCatalog.add(mallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录", 1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }

}

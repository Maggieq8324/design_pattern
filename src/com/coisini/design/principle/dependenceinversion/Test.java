package com.coisini.design.principle.dependenceinversion;

public class Test {

    public static void main(String[] args) {
        // v1 高层模块依赖低层模块
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyPythonCourse();

        // v2 面向接口编程
        Coisini coisini = new Coisini();
        coisini.studyImoocCourse(new JavaCourse());
        coisini.studyImoocCourse(new PythonCourse());
    }

}

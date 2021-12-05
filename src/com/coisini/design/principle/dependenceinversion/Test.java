package com.coisini.design.principle.dependenceinversion;

/**
 * @Description 依赖倒置原则测试类
 * @author coisini
 * @date Dec 3, 12
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        // v1 高层模块依赖低层模块
//        Coisini coisini = new Coisini();
//        coisini.studyJavaCourse();
//        coisini.studyPythonCourse();

        // v2 面向接口编程
//        Coisini coisini = new Coisini();
//        coisini.studyImoocCourse(new JavaCourse());
//        coisini.studyImoocCourse(new PythonCourse());

        // v3 setter注入
//        Coisini coisini = new Coisini();
//        coisini.setiCourse(new JavaCourse());
//        coisini.studyImoocCourse();
//
//        coisini.setiCourse(new PythonCourse());
//        coisini.studyImoocCourse();
    }

}

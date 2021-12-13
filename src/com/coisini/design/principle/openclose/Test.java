package com.coisini.design.principle.openclose;

/**
 * @Description 开闭原则测试类
 * @author coisini
 * @date Aug 27, 2021
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 接口没变，实现类没变，声明子类来继承实现类
         * 通过继承基类使扩展开放，对修改接口和基类是关闭的，变化的都是应用层的子模块
         * 越基础的模块变化影响范围越大，越高层的模块变化影响范围越小
         */

        ICourse javaCourse1 = new JavaDiscountCourse(1, "Java开发",188d);
        System.out.println("课程ID：" + javaCourse1.getId()+ " 课程名称：" + javaCourse1.getName()+ " 课程价格：" + javaCourse1.getPrice());

        JavaDiscountCourse javaCourse2 = (JavaDiscountCourse) javaCourse1;
        System.out.println("课程ID：" + javaCourse2.getId()+ " 课程名称：" + javaCourse2.getName()+ " 课程原价：" + javaCourse2.getPrice() + " 课程折扣价：" + javaCourse2.getDiscountPrice());

    }


}

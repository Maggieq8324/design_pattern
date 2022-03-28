package com.coisini.design.pattern.creational.prototype.imooc.v2;

/**
 * @Description 通过抽象类实现原型模式
 *      如果业务模型可抽象，适合这种方法
 * @author coisini
 * @date Mar 17, 2022
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}

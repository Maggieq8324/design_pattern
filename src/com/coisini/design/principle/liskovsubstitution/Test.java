package com.coisini.design.principle.liskovsubstitution;

/**
 * @Description 里氏替换原则测试类
 * @author coisini
 * @date Dec 15, 2021
 * @Version 1.0
 */
public class Test {

    /**
     * 调整大小
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
        }

        System.out.println("resize end, width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

//    public static void main(String[] args) {
//        Square square = new Square();
//        square.setLength(10);
//        resize(square);
//    }

}

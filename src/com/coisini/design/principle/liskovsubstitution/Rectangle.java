package com.coisini.design.principle.liskovsubstitution;

/**
 * @Description 长方形
 * @author coisini
 * @date Dec 15, 2021
 * @Version 1.0
 */
public class Rectangle {

    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}

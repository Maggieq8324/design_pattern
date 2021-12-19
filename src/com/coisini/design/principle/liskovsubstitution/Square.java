package com.coisini.design.principle.liskovsubstitution;

/**
 * @Description 正方形
 * @author coisini
 * @date Dec 15, 2021
 * @Version 1.0
 */
public class Square extends Rectangle{

    /**
     * 边长
     */
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}

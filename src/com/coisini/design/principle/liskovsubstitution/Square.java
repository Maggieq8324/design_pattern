package com.coisini.design.principle.liskovsubstitution;

/**
 * @Description 正方形
 * @author coisini
 * @date Dec 15, 2021
 * @Version 1.0
 */
public class Square implements Quadrangle {

    /**
     * 边长
     */
    private long sideLength;

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}

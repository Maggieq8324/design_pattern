package com.coisini.design.pattern.creational.abstractfactory.v1;

public class AndroidSurfaceFactory implements SurfaceFactory {
    @Override
    public Surface getSurface() {
        return new AndroidSurface();
    }
}

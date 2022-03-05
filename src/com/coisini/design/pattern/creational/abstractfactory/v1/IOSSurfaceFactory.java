package com.coisini.design.pattern.creational.abstractfactory.v1;

public class IOSSurfaceFactory implements SurfaceFactory {
    @Override
    public Surface getSurface() {
        return new IOSSurface();
    }
}

package com.coisini.design.principle.liskovsubstitution.methodout;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{
    @Override
    public HashMap method() {
        return new HashMap();
    }
}

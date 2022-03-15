package com.coisini.design.pattern.creational.singleton.imooc.containersingleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description 容器单例（非线程安全的）
 *      适合程序初始化时放入多个单例对象统一管理
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if(Objects.nonNull(key) && !key.isEmpty() && Objects.nonNull(instance)){
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }

    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}

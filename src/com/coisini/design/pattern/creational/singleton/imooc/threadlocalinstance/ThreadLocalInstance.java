package com.coisini.design.pattern.creational.singleton.imooc.threadlocalinstance;

/**
 * @Description ThreadLocal线程单例
 * @author coisini
 * @date Mar 14, 2022
 * @version 1.0
 */
public class ThreadLocalInstance {

    /**
     * 初始化方法
     */
    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return threadLocal.get();
    }

}

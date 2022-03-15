package com.coisini.design.pattern.creational.singleton.imooc.lazydoublechecksingleton;

/**
 * @Description 懒汉式单例模式DoubleCheck双重检查
 * @author coisini
 * @date Mar 8, 2022
 * @version 1.0
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile关键字声明共享变量，所有的线程都能看到共享内存的执行状态
     * volatile关键字修饰的共享变量在进行写操作时会将当前处理器缓存好的数据写回到系统内存
     * 该操作会使在其它CPU里缓存了该内存地址的数据无效，再次从共享内存同步数据（缓存一致性协议），通过这样保证内存的可见性
     */
    private volatile static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized(LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    /**
                     * new 过程中实际经历了3个步骤，而2和3的步骤可能重排序（java允许通过这样提高性能）
                     * 1.分配内存给该对象
                     * 2.初始化对象
                     * 3.设置instance指向刚分配的内存地址
                     *
                     * 在多线程情况下存在2、3重排序线程1访问到线程0还未初始化的对象
                     *
                     * 该场景存在两种解决方法：
                     * 1、通过声明volatile关键字不允许2、3重排序（懒汉式单例模式DoubleCheck双重检查）
                     * 2、允许2、3重排序，但不允许其它线程看到这个重排序（静态内部类单例模式）
                     *
                     */
                    instance = new LazyDoubleCheckSingleton();

                }
            }
        }

        return instance;
    }


}

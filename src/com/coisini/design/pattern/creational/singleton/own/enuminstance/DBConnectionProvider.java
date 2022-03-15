package com.coisini.design.pattern.creational.singleton.own.enuminstance;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Random;

/**
 * @Description 数据库连接池（Enum枚举单例）
 * @author coisini
 * @date Mar 15, 2022
 * @version 1.0
 */
public enum DBConnectionProvider implements Serializable {
    INSTANCE {
        /**
         * 定义数据库连接池大小
         * @param size
         */
        protected void defineSizeOfConnProvider(int size) {
            dbList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                dbList.add(new Object());
            }
        }

        /**
         * 随机获取数据库连接对象
         * @return
         */
        protected Object getConnProviderMember() {
            Random random = new Random();
            return dbList.get(random.nextInt(dbList.size()));
        }
    };

    /**
     * 数据库连接对象集合
     */
    private static LinkedList<Object> dbList;

    protected abstract void defineSizeOfConnProvider(int size);

    protected abstract Object getConnProviderMember();

    /**
     * 返回唯一实例
     * @return
     */
    public static DBConnectionProvider getInstance() {
        return INSTANCE;
    }

}

package com.coisini.design.pattern.structural.adapter.book;

/**
 * @Description 抽象成绩操作类：目标接口
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public interface ScoreOperation {

    /**
     * 成绩排序
     * @param array
     * @return
     */
    int[] sort(int array[]);

    /**
     * 成绩查找
     * @param array
     * @param key
     * @return
     */
    int search(int array[], int key);

}

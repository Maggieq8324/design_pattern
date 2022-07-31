package com.coisini.design.pattern.structural.adapter.book;

/**
 * @Description 操作适配器 适配器
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort quickSort; // 定义适配者QuickSort对象
    private BinarySearch binarySearch; //定义适配者BinarySearch对象

    public OperationAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array); // 调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key); //调用适配者类BinarySearch的查找方法
    }
}

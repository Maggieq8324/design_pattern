package com.coisini.design.pattern.structural.adapter.book;

/**
 * @Description 刘伟老师设计模式艺术-没有源码的算法库
 *   Sunny软件公司在很久以前曾开发了一个算法库，里面包含了一些常用的算法，例如排序算法和查找算法，
 *   在进行各类软件开发时经常需要重用该算法库中的算法。在为某学校开发教务管理系统时，
 *   开发人员发现需要对学生成绩进行排序和查找，该系统的设计人员已经开发了一个成绩操作接口ScoreOperation，
 *   在该接口中声明了排序方法sort(int[]) 和查找方法search(int[], int)，为了提高排序和查找的效率，
 *   开发人员决定重用算法库中的快速排序算法类QuickSort和二分查找算法类BinarySearch，
 *   其中QuickSort的quickSort(int[])方法实现了快速排序，BinarySearch 的binarySearch (int[], int)方法实现了二分查找。
 *   由于某些原因，现在Sunny公司开发人员已经找不到该算法库的源代码，无法直接通过复制和粘贴操作来重用其中的代码；
 *   部分开发人员已经针对ScoreOperation接口编程，如果再要求对该接口进行修改或要求大家直接使用QuickSort类和BinarySearch类将导致大量代码需要修改。
 *   Sunny软件公司开发人员面对这个没有源码的算法库，遇到一个幸福而又烦恼的问题：如何在既不修改现有接口又不需要任何算法库代码的基础上能够实现算法库的重用？
 * @author coisini
 * @date Jun 14, 2022
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int[] scores = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int[] result;
        int score;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        } else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        } else {
            System.out.println("没有找到成绩92。");
        }
    }

}

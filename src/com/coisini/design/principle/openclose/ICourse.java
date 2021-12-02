package com.coisini.design.principle.openclose;

/**
 * @Description 课程
 * @author coisini
 * @date Aug 27, 2021
 * @Version 1.0
 */
public interface ICourse {

    /**
     * 课程ID
     * @return
     */
    Integer getId();

    /**
     * 课程名称
     * @return
     */
    String getName();

    /**
     * 课程价格
     * @return
     */
    Double getPrice();

}

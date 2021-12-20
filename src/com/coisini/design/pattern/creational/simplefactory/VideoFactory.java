package com.coisini.design.pattern.creational.simplefactory;

/**
 * @Description Video工厂
 * @author Coisini
 * @date Dec 21, 2021
 * @version 1.0
 */
public class VideoFactory {

    /**
     * 获取Video
     * @param type
     * @return
     */
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//
//        return null;
//    }

    /**
     * 获取Video
     * 利用反射从一定程度上满足开闭原则
     * @param c
     * @return
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }

}

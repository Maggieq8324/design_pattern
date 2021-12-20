package com.coisini.design.pattern.creational.simplefactory;

/**
 * @Description 简单工厂测试类
 * @author Coisini
 * @date Dec 20, 2021
 * @version 1.0
 */
public class Test {

//    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();
//
//        video = new PythonVideo();
//        video.produce();
//    }

//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//
//        video = videoFactory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();

        video = videoFactory.getVideo(PythonVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }

}

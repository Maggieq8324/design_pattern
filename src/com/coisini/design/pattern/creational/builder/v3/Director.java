package com.coisini.design.pattern.creational.builder.v3;

/**
 * @Description 指挥者
 * @author coisini
 * @date Mar 6, 2022
 * @version 1.0
 */
public class Director {

    /**
     * 构建产品对象
     * @return
     */
    public Mode construct() {
        return new ModeBuilder()
                .buildModeName("完整模式")
                .buildShowMainMenu(true)
                .buildShowPlayList(true)
                .buildShowMainWindow(true)
                .buildShowControlBar(true)
                .buildShowFavoriteList(false)
                .build();
    }

}

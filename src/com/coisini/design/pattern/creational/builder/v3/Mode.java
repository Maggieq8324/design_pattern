package com.coisini.design.pattern.creational.builder.v3;

/**
 * @Description 模式产品类
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class Mode {

    private String modeName;
    private Boolean showMainMenu;
    private Boolean showPlayList;
    private Boolean showMainWindow;
    private Boolean showControlBar;
    private Boolean showFavoriteList;

    public Mode(ModeBuilder modeBuilder) {
        this.modeName = modeBuilder.modeName;
        this.showMainMenu = modeBuilder.showMainMenu;
        this.showPlayList = modeBuilder.showPlayList;
        this.showMainWindow = modeBuilder.showMainWindow;
        this.showControlBar = modeBuilder.showControlBar;
        this.showFavoriteList = modeBuilder.showFavoriteList;
    }

    @Override
    public String toString() {
        return "Mode{" +
                "modeName='" + modeName + '\'' +
                ", showMainMenu=" + showMainMenu +
                ", showPlayList=" + showPlayList +
                ", showMainWindow=" + showMainWindow +
                ", showControlBar=" + showControlBar +
                ", showFavoriteList=" + showFavoriteList +
                '}';
    }
}

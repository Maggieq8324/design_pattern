package com.coisini.design.pattern.creational.builder.v3;

/**
 * @Description 模式建造者
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class ModeBuilder {

    public String modeName;
    public Boolean showMainMenu;
    public Boolean showPlayList;
    public Boolean showMainWindow;
    public Boolean showControlBar;
    public Boolean showFavoriteList;

    /**
     * 构造模式名称
     */
    public ModeBuilder buildModeName(String modeName) {
        this.modeName = modeName;
        return this;
    }

    /**
     * 构造主菜单
     */
    public ModeBuilder buildShowMainMenu(Boolean isShowMainMenu) {
        this.showMainMenu = isShowMainMenu;
        return this;
    }

    /**
     * 构造播放列表
     */
    public ModeBuilder buildShowPlayList(Boolean isShowPlayList) {
        this.showPlayList = isShowPlayList;
        return this;
    }

    /**
     * 构造主窗口
     */
    public ModeBuilder buildShowMainWindow(Boolean isShowMainWindow) {
        this.showMainWindow = isShowMainWindow;
        return this;
    }

    /**
     * 构造控制条
     */
    public ModeBuilder buildShowControlBar(Boolean isShowControlBar) {
        this.showControlBar = isShowControlBar;
        return this;
    }

    /**
     * 构造收藏列表
     */
    public ModeBuilder buildShowFavoriteList(Boolean isShowFavoriteList) {
        this.showFavoriteList = isShowFavoriteList;
        return this;
    }

    public Mode build() {
        return new Mode(this);
    }

}

package com.coisini.design.pattern.creational.builder.v2;

/**
 * @Description 模式产品类
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class Mode {

    /**
     * 模式名称
     */
    private String modeName;

    /**
     * 是否显示主菜单
     */
    private Boolean showMainMenu;

    /**
     * 是否显示播放列表
     */
    private Boolean showPlayList;

    /**
     * 是否显示主窗口
     */
    private Boolean showMainWindow;

    /**
     * 是否显示控制条
     */
    private Boolean showControlBar;

    /**
     * 是否显示收藏列表
     */
    private Boolean showFavoriteList;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public Boolean getShowMainMenu() {
        return showMainMenu;
    }

    public void setShowMainMenu(Boolean showMainMenu) {
        this.showMainMenu = showMainMenu;
    }

    public Boolean getShowPlayList() {
        return showPlayList;
    }

    public void setShowPlayList(Boolean showPlayList) {
        this.showPlayList = showPlayList;
    }

    public Boolean getShowMainWindow() {
        return showMainWindow;
    }

    public void setShowMainWindow(Boolean showMainWindow) {
        this.showMainWindow = showMainWindow;
    }

    public Boolean getShowControlBar() {
        return showControlBar;
    }

    public void setShowControlBar(Boolean showControlBar) {
        this.showControlBar = showControlBar;
    }

    public Boolean getShowFavoriteList() {
        return showFavoriteList;
    }

    public void setShowFavoriteList(Boolean showFavoriteList) {
        this.showFavoriteList = showFavoriteList;
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

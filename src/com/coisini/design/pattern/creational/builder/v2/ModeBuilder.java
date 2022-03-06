package com.coisini.design.pattern.creational.builder.v2;

/**
 * @Description 模式抽象建造者
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public abstract class ModeBuilder {

    protected static Mode mode = new Mode();

    /**
     * 构造模式名称
     */
    public abstract void buildModeName();

    /**
     * 构造主菜单
     */
    public abstract void buildShowMainMenu();

    /**
     * 构造播放列表
     */
    public abstract void buildShowPlayList();

    /**
     * 构造主窗口
     */
    public abstract void buildShowMainWindow();

    /**
     * 构造控制条
     */
    public abstract void buildShowControlBar();

    /**
     * 构造收藏列表
     */
    public abstract void buildShowFavoriteList();

    public Mode construct() {
        this.buildModeName();
        this.buildShowMainMenu();
        this.buildShowPlayList();
        this.buildShowMainWindow();
        this.buildShowControlBar();
        this.buildShowFavoriteList();
        return mode;
    }

}

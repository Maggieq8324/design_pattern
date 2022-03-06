package com.coisini.design.pattern.creational.builder.v2;

/**
 * @Description 记忆模式建造者
 * @author coisini
 * @date Mar 6, 2022
 * @Version 1.0
 */
public class MemoryModeBuilder extends ModeBuilder {

    @Override
    public void buildModeName() { mode.setModeName("记忆模式"); }

    @Override
    public void buildShowMainMenu() {
        mode.setShowMainMenu(false);
    }

    @Override
    public void buildShowPlayList() {
        mode.setShowPlayList(false);
    }

    @Override
    public void buildShowMainWindow() {
        mode.setShowMainWindow(true);
    }

    @Override
    public void buildShowControlBar() { mode.setShowControlBar(true); }

    @Override
    public void buildShowFavoriteList() { mode.setShowFavoriteList(true); }

}

package com.coisini.design.pattern.structural.facade.own.v2;

/**
 * @Description 本地音乐子系统
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class LocalMusicService extends AbstractService {

    @Override
    public void backUp() {
        System.out.println("本地音乐备份成功");
    }

}

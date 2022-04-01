package com.coisini.design.pattern.structural.facade.own.v3;

/**
 * @Description 在线备份外观类
 * @author coisini
 * @date Apr 1, 2022
 * @version 1.0
 */
public class OnlineBackUpFacade extends AbstractFacade {

    private OnlineMusicService onlineMusicService;
    private OnlinePhotoService onlinePhotoService;
    private AddressBookService addressBookService;

    public OnlineBackUpFacade() {
        onlineMusicService = new OnlineMusicService();
        onlinePhotoService = new OnlinePhotoService();
        addressBookService = new AddressBookService();
    }

    @Override
    public void unifiedBackUp() {
        onlineMusicService.backUp();
        onlinePhotoService.backUp();
        addressBookService.backUp();
    }
}

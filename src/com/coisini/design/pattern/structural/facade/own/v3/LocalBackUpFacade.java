package com.coisini.design.pattern.structural.facade.own.v3;

/**
 * @Description 本地备份外观类
 * @author coisini
 * @date Apr 1, 2022
 * @version 1.0
 */
public class LocalBackUpFacade extends AbstractFacade {

    private LocalMusicService localMusicService;
    private LocalPhotoService localPhotoService;
    private AddressBookService addressBookService;

    public LocalBackUpFacade() {
        localMusicService = new LocalMusicService();
        localPhotoService = new LocalPhotoService();
        addressBookService = new AddressBookService();
    }

    @Override
    public void unifiedBackUp() {
        localMusicService.backUp();
        localPhotoService.backUp();
        addressBookService.backUp();
    }
}

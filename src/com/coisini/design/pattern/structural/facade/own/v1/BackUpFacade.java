package com.coisini.design.pattern.structural.facade.own.v1;

/**
 * @Description 备份外观类
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class BackUpFacade {

    private AddressBookService addressBookService;
    private LocalMusicService localMusicService;
    private PhotographService photographService;
    private ShortMsgService shortMsgService;

    public BackUpFacade() {
        addressBookService = new AddressBookService();
        localMusicService = new LocalMusicService();
        photographService = new PhotographService();
        shortMsgService = new ShortMsgService();
    }

    /**
     * 统一备份
     */
    public void unifiedBackUp() {
        addressBookService.backUp();
        localMusicService.backUp();
        photographService.backUp();
        shortMsgService.backUp();
    }

}

package com.coisini.design.pattern.structural.facade.own.v2;

import com.coisini.design.util.PropertiesUtil;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 备份外观类
 * @author coisini
 * @date Mar 30, 2022
 * @version 1.0
 */
public class BackUpFacade {

    private List<AbstractService> abstractServiceList;

    public BackUpFacade() {
        abstractServiceList = PropertiesUtil.getFacadePatternBeans()
                                            .stream()
                                            .map(bean -> (AbstractService) bean)
                                            .collect(Collectors.toList());
    }

    /**
     * 统一备份
     */
    public void unifiedBackUp() {
        this.abstractServiceList.forEach(AbstractService::backUp);
    }

}

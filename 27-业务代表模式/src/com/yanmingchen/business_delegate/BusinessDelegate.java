package com.yanmingchen.business_delegate;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:50 2018/6/15
 * @Description:业务代表类
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

}

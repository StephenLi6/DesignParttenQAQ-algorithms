package com.yanmingchen.business_delegate;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:50 2018/6/15
 * @Description:客户端类
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}

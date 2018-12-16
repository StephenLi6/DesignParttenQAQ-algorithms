package com.yanmingchen.business_delegate;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:49 2018/6/15
 * @Description:JMS服务类
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }

}

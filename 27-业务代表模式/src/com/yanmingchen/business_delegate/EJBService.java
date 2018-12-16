package com.yanmingchen.business_delegate;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:48 2018/6/15
 * @Description:EJB服务类
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }

}

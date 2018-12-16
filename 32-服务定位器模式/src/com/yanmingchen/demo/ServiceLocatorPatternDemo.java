package com.yanmingchen.demo;

import com.yanmingchen.service_locator.Service;
import com.yanmingchen.service_locator.ServiceLocator;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:14 2018/6/15
 * @Description:
 */
public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }

}

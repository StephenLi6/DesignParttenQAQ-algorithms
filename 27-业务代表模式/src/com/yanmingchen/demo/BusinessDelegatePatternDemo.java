package com.yanmingchen.demo;

import com.yanmingchen.business_delegate.BusinessDelegate;
import com.yanmingchen.business_delegate.Client;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:51 2018/6/15
 * @Description:
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }

}

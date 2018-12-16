package com.yanmingchen.business_delegate;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:49 2018/6/15
 * @Description:业务查看类
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if("EJB".equalsIgnoreCase(serviceType)){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }

}

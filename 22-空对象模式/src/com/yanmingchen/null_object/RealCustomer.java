package com.yanmingchen.null_object;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:20 2018/6/15
 * @Description:真实客户类
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

}

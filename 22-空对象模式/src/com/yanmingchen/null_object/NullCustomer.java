package com.yanmingchen.null_object;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:21 2018/6/15
 * @Description:空客户类
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}

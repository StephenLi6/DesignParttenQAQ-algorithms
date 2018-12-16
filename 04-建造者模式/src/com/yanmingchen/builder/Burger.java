package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:55 2018/6/14
 * @Description:汉堡包
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}

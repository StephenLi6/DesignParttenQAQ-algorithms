package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:56 2018/6/14
 * @Description:冷饮
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}

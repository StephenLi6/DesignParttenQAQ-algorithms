package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:59 2018/6/14
 * @Description:鸡肉汉堡
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}

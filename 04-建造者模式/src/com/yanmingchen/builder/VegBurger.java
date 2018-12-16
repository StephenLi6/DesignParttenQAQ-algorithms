package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:58 2018/6/14
 * @Description:蔬菜汉堡
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

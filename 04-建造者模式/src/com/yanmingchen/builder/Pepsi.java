package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:01 2018/6/14
 * @Description:百事可乐
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}

package com.yanmingchen.builder;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:00 2018/6/14
 * @Description:可口可乐
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }

}

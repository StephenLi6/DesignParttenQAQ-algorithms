package com.yanmingchen.bridge;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:53 2018/6/14
 * @Description:图形抽象类
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}

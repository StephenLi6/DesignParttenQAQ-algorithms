package com.yanmingchen.observer;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:51 2018/6/15
 * @Description:观察者抽象类
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}

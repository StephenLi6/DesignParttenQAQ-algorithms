package com.yanmingchen.strategy;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:26 2018/6/15
 * @Description:上下文类
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }

}

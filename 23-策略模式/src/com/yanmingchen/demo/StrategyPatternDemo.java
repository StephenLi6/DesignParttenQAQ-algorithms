package com.yanmingchen.demo;

import com.yanmingchen.strategy.Context;
import com.yanmingchen.strategy.OperationAdd;
import com.yanmingchen.strategy.OperationMultiply;
import com.yanmingchen.strategy.OperationSubstract;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:26 2018/6/15
 * @Description:
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}

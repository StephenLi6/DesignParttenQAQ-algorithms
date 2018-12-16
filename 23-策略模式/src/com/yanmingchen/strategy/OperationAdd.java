package com.yanmingchen.strategy;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:24 2018/6/15
 * @Description:操作相加类
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}

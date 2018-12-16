package com.yanmingchen.strategy;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:25 2018/6/15
 * @Description:操作相乘类
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}

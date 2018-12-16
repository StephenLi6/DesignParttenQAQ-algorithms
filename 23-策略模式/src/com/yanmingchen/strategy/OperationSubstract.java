package com.yanmingchen.strategy;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:25 2018/6/15
 * @Description:操作相减类
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}

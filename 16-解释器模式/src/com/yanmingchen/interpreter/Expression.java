package com.yanmingchen.interpreter;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:17 2018/6/15
 * @Description:表达式接口
 */
public interface Expression {

    public boolean interpret(String context);

}

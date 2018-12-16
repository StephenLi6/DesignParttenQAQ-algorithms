package com.yanmingchen.interpreter;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:18 2018/6/15
 * @Description:终端表达式类
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }

}

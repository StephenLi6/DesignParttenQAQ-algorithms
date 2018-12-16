package com.yanmingchen.interpreter;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:20 2018/6/15
 * @Description:或者 表达式类
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }

}

package com.yanmingchen.visitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:36 2018/6/15
 * @Description:
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);

}

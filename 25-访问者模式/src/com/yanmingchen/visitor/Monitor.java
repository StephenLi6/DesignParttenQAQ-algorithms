package com.yanmingchen.visitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:35 2018/6/15
 * @Description:显示器类
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

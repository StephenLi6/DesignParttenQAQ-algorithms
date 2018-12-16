package com.yanmingchen.visitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:35 2018/6/15
 * @Description:鼠标类
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

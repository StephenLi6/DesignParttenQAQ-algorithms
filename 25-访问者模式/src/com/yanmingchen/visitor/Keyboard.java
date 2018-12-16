package com.yanmingchen.visitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:34 2018/6/15
 * @Description:键盘类
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

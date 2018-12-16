package com.yanmingchen.demo;

import com.yanmingchen.visitor.Computer;
import com.yanmingchen.visitor.ComputerPart;
import com.yanmingchen.visitor.ComputerPartDisplayVisitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:37 2018/6/15
 * @Description:
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}

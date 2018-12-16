package com.yanmingchen.visitor;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:34 2018/6/15
 * @Description:电脑配置接口
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);

}

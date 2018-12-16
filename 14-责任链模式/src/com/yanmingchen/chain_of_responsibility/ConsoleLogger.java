package com.yanmingchen.chain_of_responsibility;

/**
 * @Author: YanmingChen
 * @Date: Create in 8:54 2018/6/15
 * @Description:控制台日志类
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}

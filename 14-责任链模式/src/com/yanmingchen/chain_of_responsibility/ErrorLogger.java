package com.yanmingchen.chain_of_responsibility;

/**
 * @Author: YanmingChen
 * @Date: Create in 8:55 2018/6/15
 * @Description:错误日志类
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}

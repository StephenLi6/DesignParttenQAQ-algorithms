package com.yanmingchen.chain_of_responsibility;

/**
 * @Author: YanmingChen
 * @Date: Create in 8:56 2018/6/15
 * @Description:文件日志类
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}

package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:06 2018/6/15
 * @Description:debug过滤器类
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }

}

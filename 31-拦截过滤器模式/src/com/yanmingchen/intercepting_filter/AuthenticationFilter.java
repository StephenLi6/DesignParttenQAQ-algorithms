package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:05 2018/6/15
 * @Description:认证过滤器类
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }

}

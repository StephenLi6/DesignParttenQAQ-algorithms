package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:05 2018/6/15
 * @Description:过滤器接口
 */
public interface Filter {

    public void execute(String request);

}

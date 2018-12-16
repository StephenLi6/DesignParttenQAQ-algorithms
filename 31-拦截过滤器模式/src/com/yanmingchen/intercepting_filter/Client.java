package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:08 2018/6/15
 * @Description:客户端类
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }

}

package com.yanmingchen.demo;

import com.yanmingchen.intercepting_filter.*;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:08 2018/6/15
 * @Description:
 */
public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }

}

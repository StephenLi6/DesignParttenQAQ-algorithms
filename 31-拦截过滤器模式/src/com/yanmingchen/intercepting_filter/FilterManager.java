package com.yanmingchen.intercepting_filter;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:07 2018/6/15
 * @Description:过滤器管理类
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }

}

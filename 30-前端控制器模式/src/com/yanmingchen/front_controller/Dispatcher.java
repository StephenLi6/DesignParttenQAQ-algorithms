package com.yanmingchen.front_controller;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:02 2018/6/15
 * @Description:调度器类
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if ("STUDENT".equalsIgnoreCase(request)) {
            studentView.show();
        } else {
            homeView.show();
        }
    }

}

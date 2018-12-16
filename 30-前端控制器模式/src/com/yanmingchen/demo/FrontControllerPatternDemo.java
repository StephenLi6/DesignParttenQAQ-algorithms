package com.yanmingchen.demo;

import com.yanmingchen.front_controller.FrontController;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:03 2018/6/15
 * @Description:
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }

}

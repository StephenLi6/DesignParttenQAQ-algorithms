package com.yanmingchen.demo;

import com.yanmingchen.mediator.User;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:37 2018/6/15
 * @Description:
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}

package com.yanmingchen.observer;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:52 2018/6/15
 * @Description:二进制观察类
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }

}

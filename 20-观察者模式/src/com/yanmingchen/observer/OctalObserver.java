package com.yanmingchen.observer;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:52 2018/6/15
 * @Description:八进制观察者类
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }

}

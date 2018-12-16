package com.yanmingchen.demo;

import com.yanmingchen.observer.BinaryObserver;
import com.yanmingchen.observer.HexaObserver;
import com.yanmingchen.observer.OctalObserver;
import com.yanmingchen.observer.Subject;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:54 2018/6/15
 * @Description:
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}

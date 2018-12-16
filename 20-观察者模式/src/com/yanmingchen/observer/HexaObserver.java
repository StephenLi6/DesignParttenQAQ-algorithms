package com.yanmingchen.observer;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:53 2018/6/15
 * @Description:十六进制观察者类
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}

package com.yanmingchen.state;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:16 2018/6/15
 * @Description:停止状态类
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }

}

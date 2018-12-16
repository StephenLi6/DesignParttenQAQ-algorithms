package com.yanmingchen.state;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:15 2018/6/15
 * @Description:开始状态类
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }

}

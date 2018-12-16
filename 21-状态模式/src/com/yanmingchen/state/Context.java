package com.yanmingchen.state;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:16 2018/6/15
 * @Description:
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}

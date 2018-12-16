package com.yanmingchen.memento;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:42 2018/6/15
 * @Description:备忘录类
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}

package com.yanmingchen.memento;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:42 2018/6/15
 * @Description:作者类
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}

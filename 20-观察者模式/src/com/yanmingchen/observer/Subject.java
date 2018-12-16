package com.yanmingchen.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:50 2018/6/15
 * @Description:科目类
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

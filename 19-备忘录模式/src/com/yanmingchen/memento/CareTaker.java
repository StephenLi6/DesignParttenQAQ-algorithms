package com.yanmingchen.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:43 2018/6/15
 * @Description:管理员类
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}

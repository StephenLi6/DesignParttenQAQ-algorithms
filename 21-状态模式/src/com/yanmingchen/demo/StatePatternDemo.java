package com.yanmingchen.demo;

import com.yanmingchen.state.Context;
import com.yanmingchen.state.StartState;
import com.yanmingchen.state.StopState;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:16 2018/6/15
 * @Description:
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}

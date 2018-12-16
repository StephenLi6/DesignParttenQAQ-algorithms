package com.yanmingchen.template;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:30 2018/6/15
 * @Description:足球类
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

}

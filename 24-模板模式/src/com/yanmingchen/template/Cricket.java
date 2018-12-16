package com.yanmingchen.template;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:29 2018/6/15
 * @Description:板球类
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

}

package com.yanmingchen.template;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:28 2018/6/15
 * @Description:抽象游戏类
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}

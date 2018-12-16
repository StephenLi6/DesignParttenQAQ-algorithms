package com.yanmingchen.adapter;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:37 2018/6/14
 * @Description:mp4格式播放器
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放mp4视频：" + fileName);
    }

}

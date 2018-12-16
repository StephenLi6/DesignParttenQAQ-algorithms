package com.yanmingchen.adapter;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:36 2018/6/14
 * @Description:vlc格式播放器
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("播放vlc视频: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }

}

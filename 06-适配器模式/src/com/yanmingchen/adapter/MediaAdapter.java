package com.yanmingchen.adapter;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:38 2018/6/14
 * @Description:多媒体适配器
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }

}

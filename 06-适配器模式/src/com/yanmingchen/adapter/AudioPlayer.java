package com.yanmingchen.adapter;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:41 2018/6/14
 * @Description:音频播放器
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("播放mp3文件: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("不支持：" + audioType + "格式文件播放");
        }
    }

}

package indi.twc.pattern.adapter.impl;

import indi.twc.pattern.adapter.AdvancedMediaPlayer;
import indi.twc.pattern.adapter.MediaPlayer;

/**
 * 适配器，加上成员变量AdvancedMediaPlayer
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.playMp4(fileName);
        }else if(audioType.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}

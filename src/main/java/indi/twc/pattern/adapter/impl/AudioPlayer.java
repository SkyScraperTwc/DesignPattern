package indi.twc.pattern.adapter.impl;

import indi.twc.pattern.adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else  if(audioType.equals("vlc")  || audioType.equals("mp4")){
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+audioType + " format not supported");
        }
    }
}

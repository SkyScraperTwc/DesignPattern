package indi.twc.pattern.adapter.test;

import indi.twc.pattern.adapter.impl.AudioPlayer;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void testAdapter() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "twc");
        audioPlayer.play("mp3", "twc2");
        audioPlayer.play("mp4", "twc3");
    }
}

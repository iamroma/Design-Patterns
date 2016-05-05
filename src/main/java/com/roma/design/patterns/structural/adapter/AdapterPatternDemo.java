package com.roma.design.patterns.structural.adapter;

import com.roma.design.patterns.structural.adapter.classes.AudioPlayer;

/**
 * Created by Roma on 5/5/16.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}

package com.roma.design.patterns.structural.adapter.classes;

import com.roma.design.patterns.structural.adapter.interfaces.AdvancedMediaPlayer;

/**
 * Created by Roma on 5/5/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {

    }
}

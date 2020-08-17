package com.dhy.personal.designpattern.behavioral.state;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 20:32
 */
public class StopState extends MusicState{

    @Override
    void play() {
        super.musicStateContext.setMusicState(MusicStateContext.PLAY_STATE);
    }

    @Override
    void speed() {
        System.out.println("不能快进");
    }

    @Override
    void stop() {
        super.musicStateContext.setMusicState(MusicStateContext.STOP_STATE);

    }

    @Override
    void pause() {
        super.musicStateContext.setMusicState(MusicStateContext.PAUSE_STATE);
    }
}

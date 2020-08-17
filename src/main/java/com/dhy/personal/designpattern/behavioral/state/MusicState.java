package com.dhy.personal.designpattern.behavioral.state;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 20:30
 */
public abstract class MusicState {

    protected MusicStateContext musicStateContext;

    public void setMusicStateContext(MusicStateContext musicStateContext) {
        this.musicStateContext = musicStateContext;
    }

    abstract void play();

    abstract void speed();

    abstract void stop();

    abstract void pause();
}

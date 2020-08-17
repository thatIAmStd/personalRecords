package com.dhy.personal.designpattern.behavioral.state;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 20:31
 */
public class MusicStateContext {

    private MusicState musicState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public MusicState getMusicState() {
        return musicState;
    }

    public void setMusicState(MusicState musicState) {
        this.musicState = musicState;
        this.musicState.setMusicStateContext(this);
    }

    public void play() {
        this.musicState.play();
    }

    public void speed() {
        this.musicState.speed();
    }

    public void stop() {
        this.musicState.stop();
    }

    public void pause() {
        this.musicState.pause();
    }
}

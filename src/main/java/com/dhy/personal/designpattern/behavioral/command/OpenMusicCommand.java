package com.dhy.personal.designpattern.behavioral.command;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:00
 */
public class OpenMusicCommand implements Command {

    private Music music;

    public OpenMusicCommand(Music music) {
        this.music = music;
    }

    private void open() {
        music.open();
    }

    @Override
    public void excute() {
            open();
    }
}

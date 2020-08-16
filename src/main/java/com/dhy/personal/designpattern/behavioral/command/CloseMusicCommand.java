package com.dhy.personal.designpattern.behavioral.command;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:02
 */
public class CloseMusicCommand implements Command {

    private Music music;

    public CloseMusicCommand(Music music) {
        this.music = music;
    }

    private void close() {
        music.close();
    }

    @Override
    public void excute() {
        close();
    }
}

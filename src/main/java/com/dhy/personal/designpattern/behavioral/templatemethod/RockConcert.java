package com.dhy.personal.designpattern.behavioral.templatemethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 16:20
 */
public class RockConcert extends PlayConcert{
    @Override
    void takeInstruments() {
        System.out.println("准备 贝斯，电吉他，军鼓，锁啦");
    }

    @Override
    protected boolean isOpenLight() {
        return true;
    }

    @Override
    protected void lightUp() {
        System.out.println("打开彩色的灯");
    }

    @Override
    void playSong() {
        System.out.println("play song [knock on haven's door]");
    }
}

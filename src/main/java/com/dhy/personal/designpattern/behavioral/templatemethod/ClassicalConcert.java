package com.dhy.personal.designpattern.behavioral.templatemethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 16:22
 */
public class ClassicalConcert extends PlayConcert{


    @Override
    void takeInstruments() {
        System.out.println("准备钢琴，小提琴");
    }

    @Override
    void playSong() {
        System.out.println("play 至爱丽丝");
    }
}

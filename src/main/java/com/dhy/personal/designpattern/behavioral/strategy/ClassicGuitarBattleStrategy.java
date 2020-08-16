package com.dhy.personal.designpattern.behavioral.strategy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:24
 */
public class ClassicGuitarBattleStrategy implements  GuitarBattleStrategy{

    @Override
    public void playSong() {
        System.out.println("使用古典吉他来演奏乡村乐");
    }
}

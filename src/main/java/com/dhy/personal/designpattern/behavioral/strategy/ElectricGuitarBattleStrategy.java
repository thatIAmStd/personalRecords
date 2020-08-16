package com.dhy.personal.designpattern.behavioral.strategy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:22
 */
public class ElectricGuitarBattleStrategy implements GuitarBattleStrategy{

    @Override
    public void playSong() {
        System.out.println("使用电吉他来进行演奏布鲁斯风格");
    }
}

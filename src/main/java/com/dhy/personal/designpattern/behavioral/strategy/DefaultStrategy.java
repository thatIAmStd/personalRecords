package com.dhy.personal.designpattern.behavioral.strategy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:25
 */
public class DefaultStrategy implements GuitarBattleStrategy {
    @Override
    public void playSong() {
        System.out.println("默认策略，do nothing");
    }
}

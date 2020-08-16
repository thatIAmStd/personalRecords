package com.dhy.personal.designpattern.behavioral.strategy;

/**
 * 通过对这个类对策略进行包装，可以很好的扩展
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:45
 */
public class GuitarStrategyContex {
    private GuitarBattleStrategy guitarBattleStrategy;

    public GuitarStrategyContex(GuitarBattleStrategy guitarBattleStrategy) {
        this.guitarBattleStrategy = guitarBattleStrategy;
    }

    public void playSong(){
        guitarBattleStrategy.playSong();
    }
}

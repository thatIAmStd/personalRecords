package com.dhy.personal.designpattern.behavioral.strategy;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:39
 */
public class Test {

    public static void main(String[] args) {
        GuitarStrategyContex guitarStrategyContex = new GuitarStrategyContex(GuitarBattleStrategyFactory.getStrategy("classic"));
        guitarStrategyContex.playSong();

        guitarStrategyContex = new GuitarStrategyContex(GuitarBattleStrategyFactory.getStrategy("elect"));
        guitarStrategyContex.playSong();
    }
}

package com.dhy.personal.designpattern.behavioral.strategy;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 15:33
 */
public class GuitarBattleStrategyFactory {

    private final static Map<String, GuitarBattleStrategy> GUITAR_BATTLE_STRATEGY = Maps.newHashMap();

    private GuitarBattleStrategyFactory() {

    }

    static {
        GUITAR_BATTLE_STRATEGY.put(Const.CLASSIC, new ClassicGuitarBattleStrategy());
        GUITAR_BATTLE_STRATEGY.put(Const.ELECT, new ElectricGuitarBattleStrategy());
    }

    private final static DefaultStrategy DEFAULT_STRATEGY = new DefaultStrategy();

    /**
     * 获取对应策略
     */
    public static GuitarBattleStrategy getStrategy(String strategy) {
        GuitarBattleStrategy guitarBattleStrategy = GUITAR_BATTLE_STRATEGY.get(strategy);
        return null == guitarBattleStrategy ? DEFAULT_STRATEGY : guitarBattleStrategy;
    }


    private interface Const {
        String CLASSIC = "classic";
        String ELECT = "elect";
    }
}

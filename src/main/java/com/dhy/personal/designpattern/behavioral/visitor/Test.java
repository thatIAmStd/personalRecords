package com.dhy.personal.designpattern.behavioral.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:37
 */
public class Test {

    public static void main(String[] args) {
        FreeMusic freeMusic = new FreeMusic();
        freeMusic.setName("小夜曲");

        ChargeMusic chargeMusic = new ChargeMusic();
        chargeMusic.setName("last dance");
        chargeMusic.setPrice(12.0);

        List<BaseMusic> list = Lists.newArrayList(freeMusic,chargeMusic);

        MusicVisitor musicVisitor = new MusicVisitor();
        list.forEach(o->{
            o.accept(musicVisitor);
        });
    }
}

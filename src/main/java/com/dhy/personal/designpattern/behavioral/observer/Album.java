package com.dhy.personal.designpattern.behavioral.observer;

import java.util.Observable;

/**
 * 专辑，被观察者
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/15 10:03
 */
public class Album extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public Album(String name) {
        this.name = name;
    }

    public void addSong(Album album, Song song) {
        setChanged();

        //传参数
        notifyObservers(song);
        System.out.println("专辑《" + album.getName() + "》添加了一首歌《" + name + "》");
    }
}

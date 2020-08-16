package com.dhy.personal.designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 听众，观察者
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/15 10:02
 */
public class Listener implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public Listener(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Album album = (Album) o;
        Song song = (Song) arg;

        System.out.println(name + "关注的专辑《" + album.getName() + "》添加了一首歌曲《" + song.getName() + "》");
    }
}

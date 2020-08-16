package com.dhy.personal.designpattern.behavioral.observer;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/15 10:13
 */
public class Test {

    public static void main(String[] args) {
        Album album = new Album("烈日下烤火");
        Listener listener1 = new Listener("dhy");
        Listener listener2 = new Listener("hsf");

        //添加观察者
        album.addObserver(listener1);
        album.addObserver(listener2);

        Song song = new Song("烈日天");
        album.addSong(album, song);

        album.notifyObservers();
    }
}

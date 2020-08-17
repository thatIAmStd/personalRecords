package com.dhy.personal.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 19:38
 */
public class MusicAggregate implements Aggregate<Music> {

    private List<Music> musicList;

    public MusicAggregate(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Override
    public void addEle(Music music) {
        musicList.add(music);
    }

    @Override
    public void remove(Music music) {
        musicList.remove(music);
    }

    @Override
    public Iterator<Music> getIterator() {
        return new IteratorImpl<>(musicList);
    }
}

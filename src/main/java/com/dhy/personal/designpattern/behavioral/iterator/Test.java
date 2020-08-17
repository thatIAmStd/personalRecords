package com.dhy.personal.designpattern.behavioral.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 17:36
 */
public class Test {

    public static void main(String[] args) {
        Music music1 = new Music();
        music1.setName("加州旅馆");

        Music music2 = new Music();
        music2.setName("where is my mind");

        Music music3 = new Music();
        music3.setName("十一月的雨");

        List<Music> list = Lists.newArrayList(music1, music2, music3);

        MusicAggregate musicAggregate = new MusicAggregate(list);

        Iterator<Music> iterator = musicAggregate.getIterator();
        System.out.println(iterator.nextElement());
        System.out.println(iterator.nextElement());

        System.out.println(iterator.hasNextEle());
        System.out.println(iterator.nextElement());
    }
}

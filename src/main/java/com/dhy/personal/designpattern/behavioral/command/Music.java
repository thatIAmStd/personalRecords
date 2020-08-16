package com.dhy.personal.designpattern.behavioral.command;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:07
 */
public class Music {

    private String name;

    public Music(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("打开音乐" + name);
    }

    public void close() {
        System.out.println("关闭音乐" + name);
    }
}

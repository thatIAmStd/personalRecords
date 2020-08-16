package com.dhy.personal.designpattern.behavioral.mediator;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/16 10:54
 */
public class Test {

    public static void main(String[] args) {
        User tom = new User();
        tom.setName("tom");

        User hsf = new User();
        hsf.setName("黄狮虎");

        tom.sendMsg("走出去吃饭了");
        hsf.sendMsg("还不怎么饿，没胃口啊");

        tom.sendMsg("呵呵");
    }
}

package com.dhy.personal.designpattern.constractor.adapter.objectadapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:13
 */
public class Adapter implements Target {
    private final  Adaptee adaptee = new Adaptee();

    @Override
    public void request() {

        //do
        adaptee.handleRequest();
        //....
    }
}

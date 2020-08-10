package com.dhy.personal.designpattern.constractor.adapter.classadapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:13
 */
public class Adapter extends Adaptee implements Target {


    @Override
    public void request() {

        //do
        super.handleRequest();

        //....
    }
}

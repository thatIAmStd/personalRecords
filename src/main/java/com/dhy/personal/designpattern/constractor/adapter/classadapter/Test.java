package com.dhy.personal.designpattern.constractor.adapter.classadapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:18
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

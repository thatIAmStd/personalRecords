package com.dhy.personal.designpattern.constractor.adapter.classadapter;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/7 20:12
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体的目标方法");
    }
}

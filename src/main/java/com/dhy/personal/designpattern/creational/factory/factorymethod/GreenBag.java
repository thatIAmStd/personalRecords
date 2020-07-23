package com.dhy.personal.designpattern.creational.factory.factorymethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/22 22:27
 */
public class GreenBag implements Bag {
    @Override
    public void showColor() {
        System.out.println("显示绿色的包");
    }
}

package com.dhy.personal.designpattern.creational.factory.simplefactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/22 22:31
 */
public class Test {

    public static void main(String[] args) {
        BagFactory bagFactory = new BagFactory();
        Bag bag = bagFactory.getBag(GreenBag.class);
        bag.showColor();

        bag = bagFactory.getBag(RedBag.class);
        bag.showColor();
    }
}

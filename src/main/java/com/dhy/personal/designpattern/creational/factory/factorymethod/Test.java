package com.dhy.personal.designpattern.creational.factory.factorymethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/22 22:31
 */
public class Test {

    public static void main(String[] args) {

        RedBagFactoryImpl bagFactory = new RedBagFactoryImpl();
        bagFactory.getBag().showColor();

    }
}

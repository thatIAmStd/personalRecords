package com.dhy.personal.designpattern.creational.factory.factorymethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 14:32
 */
public class RedBagFactoryImpl extends BagFactory{


    @Override
    public RedBag getBag() {
            return new RedBag();
    }
}

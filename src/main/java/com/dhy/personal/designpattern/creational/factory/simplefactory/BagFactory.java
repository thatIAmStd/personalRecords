package com.dhy.personal.designpattern.creational.factory.simplefactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/22 22:28
 */
public class BagFactory {

    public Bag getBag(Class c) {
        Bag bag = null;
        try {
            bag = (Bag) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bag;
    }
}

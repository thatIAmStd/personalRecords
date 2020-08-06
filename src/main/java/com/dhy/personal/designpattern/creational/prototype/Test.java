package com.dhy.personal.designpattern.creational.prototype;

import org.apache.commons.lang3.RandomUtils;

import java.util.Date;
import java.util.Random;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/5 22:24
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Tank tank = new Tank();
        tank.setColor("红色");
        tank.setCreateDate(new Date());
        tank.setSize("size");

        for(int i = 0;i< 10;i++){
            Tank tank1 = (Tank) tank.clone();
            tank1.setCreateDate( new Date(RandomUtils.nextInt(0,1000000000)));
            tank1.setSize("size"+i);
            System.out.println(tank1);
        }
    }
}

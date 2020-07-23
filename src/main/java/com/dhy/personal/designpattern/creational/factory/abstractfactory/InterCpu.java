package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:12
 */
public class InterCpu implements Cpu {
    @Override
    public void calculate() {
        System.out.println("用InterCpu 计算");
    }
}

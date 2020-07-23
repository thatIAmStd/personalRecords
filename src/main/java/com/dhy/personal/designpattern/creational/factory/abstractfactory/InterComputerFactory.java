package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:11
 */
public class InterComputerFactory extends ComputerFactory{
    @Override
    public Cpu createCpu() {
        return new InterCpu();
    }

    @Override
    public Disk createDisk() {
        return new InterDisk();
    }
}

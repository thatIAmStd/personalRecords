package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:10
 */
public class AmdComputerFactory extends ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Disk createDisk() {
        return new AmdDisk();
    }
}

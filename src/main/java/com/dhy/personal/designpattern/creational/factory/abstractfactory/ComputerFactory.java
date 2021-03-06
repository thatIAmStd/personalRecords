package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:08
 */
public abstract class ComputerFactory {

    public abstract Cpu createCpu();

    public abstract Disk createDisk();

}

package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:14
 */
public class Test {

    public static void main(String[] args) {
        ComputerFactory factory = new AmdComputerFactory();
        factory.createCpu().calculate();
        factory.createDisk().readFile();
    }
}

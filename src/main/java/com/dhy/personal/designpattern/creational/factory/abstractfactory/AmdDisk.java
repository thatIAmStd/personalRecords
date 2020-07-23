package com.dhy.personal.designpattern.creational.factory.abstractfactory;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 16:13
 */
public class AmdDisk implements Disk {
    @Override
    public void readFile() {
        System.out.println("用AmdDisk 读取文件");
    }
}

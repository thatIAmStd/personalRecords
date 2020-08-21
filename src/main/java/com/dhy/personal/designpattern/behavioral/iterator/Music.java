package com.dhy.personal.designpattern.behavioral.iterator;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 19:38
 */
public class Music {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}

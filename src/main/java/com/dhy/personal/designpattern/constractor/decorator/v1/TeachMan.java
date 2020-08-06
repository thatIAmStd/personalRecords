package com.dhy.personal.designpattern.constractor.decorator.v1;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:35
 */
public class TeachMan extends Man {

    @Override
    public String work() {
        return super.work() + " 教书";
    }

    @Override
    public int getMoney() {
        return super.getMoney() + 1;
    }
}

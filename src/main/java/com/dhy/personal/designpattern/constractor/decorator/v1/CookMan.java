package com.dhy.personal.designpattern.constractor.decorator.v1;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:35
 */
public class CookMan extends TeachMan {

    @Override
    public String work() {
        return super.work() + " 做饭 ";
    }

    @Override
    public int getMoney() {
        return super.getMoney() + 2;
    }
}

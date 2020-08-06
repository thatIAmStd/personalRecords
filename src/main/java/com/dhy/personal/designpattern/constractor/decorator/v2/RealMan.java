package com.dhy.personal.designpattern.constractor.decorator.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:38
 */
public class RealMan extends AMan {

    @Override
    public String work() {
        return "开始打工";
    }

    @Override
    public int getMoney() {
        return 0;
    }
}

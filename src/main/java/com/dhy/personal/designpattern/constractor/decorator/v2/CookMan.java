package com.dhy.personal.designpattern.constractor.decorator.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:40
 */
public class CookMan extends WorkDecorator {

    public CookMan(AMan aMan) {
        super(aMan);
    }

    @Override
    public String work() {
        return super.work() + " 开始做饭 ";
    }

    @Override
    public int getMoney() {
        return super.getMoney() + 2;
    }
}

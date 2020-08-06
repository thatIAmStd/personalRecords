package com.dhy.personal.designpattern.constractor.decorator.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:41
 */
public class CleanMan extends WorkDecorator {


    public CleanMan(AMan aMan) {
        super(aMan);
    }

    @Override
    public String work() {
        return super.work() + " 开始做清洁";
    }

    @Override
    public int getMoney() {
        return super.getMoney() + 1;
    }
}

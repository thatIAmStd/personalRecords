package com.dhy.personal.designpattern.constractor.decorator.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:39
 */
public class WorkDecorator extends AMan {
    private AMan aMan;

    public WorkDecorator(AMan aMan) {
        this.aMan = aMan;
    }

    @Override
    public String work() {
        return aMan.work();
    }

    @Override
    public int getMoney() {
        return aMan.getMoney();
    }
}

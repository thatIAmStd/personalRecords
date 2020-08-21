package com.dhy.personal.designpattern.behavioral.visitor;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/21 10:13
 */
public class MusicVisitor implements IVisitor {

    @Override
    public void visit(FreeMusic freeMusic) {
        System.out.println("免费音乐：" + freeMusic.getName());
    }

    @Override
    public void visit(ChargeMusic chargeMusic) {
        System.out.println("收费音乐：" + chargeMusic.getName() + ",价格为：" + chargeMusic.getPrice() + "元");
    }
}

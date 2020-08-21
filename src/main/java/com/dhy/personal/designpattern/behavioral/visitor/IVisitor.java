package com.dhy.personal.designpattern.behavioral.visitor;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/21 10:11
 */
public interface IVisitor {

    void visit(FreeMusic freeMusic);

    void visit(ChargeMusic chargeMusic);
}

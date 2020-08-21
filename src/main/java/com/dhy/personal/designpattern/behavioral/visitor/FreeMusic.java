package com.dhy.personal.designpattern.behavioral.visitor;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/21 10:10
 */
public class FreeMusic extends BaseMusic{

    @Override
    protected void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}

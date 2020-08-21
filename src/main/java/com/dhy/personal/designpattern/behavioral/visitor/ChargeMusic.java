package com.dhy.personal.designpattern.behavioral.visitor;


import lombok.Data;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/21 10:12
 */
@Data
public class ChargeMusic extends BaseMusic{

    private double price;

    @Override
    protected void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}

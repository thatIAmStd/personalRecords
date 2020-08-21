package com.dhy.personal.designpattern.behavioral.visitor;

import lombok.Data;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/21 10:09
 */
@Data
public abstract class BaseMusic {
    private String name;

    protected abstract void accept(IVisitor iVisitor);
}

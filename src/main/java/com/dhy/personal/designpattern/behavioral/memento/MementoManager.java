package com.dhy.personal.designpattern.behavioral.memento;

import java.util.Stack;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 20:09
 */
public class MementoManager<T> {

    private final Stack<T> STACK = new Stack<>();

    public void addEle(T t) {
        STACK.push(t);
    }

    public T getEle() {
        return STACK.pop();
    }
}

package com.dhy.personal.designpattern.behavioral.iterator;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 19:39
 */
public interface Aggregate<T> {

    abstract void addEle(T t);

    abstract void remove(T t);

    abstract  Iterator getIterator();
}

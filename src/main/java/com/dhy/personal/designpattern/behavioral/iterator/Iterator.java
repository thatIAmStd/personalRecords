package com.dhy.personal.designpattern.behavioral.iterator;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 19:32
 */
public interface Iterator<T> {

    T nextElement();

    boolean hasNextEle();
}

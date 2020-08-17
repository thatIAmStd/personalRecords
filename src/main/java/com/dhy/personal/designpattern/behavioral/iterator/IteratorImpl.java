package com.dhy.personal.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/17 19:34
 */
public class IteratorImpl<T> implements Iterator<T> {

    private List<T> objects;
    private int position = 0;

    public IteratorImpl(List<T> objects) {
        this.objects = objects;
    }

    @Override
    public T nextElement() {
        if (position > objects.size()) {
            throw new ArrayIndexOutOfBoundsException("长度越界");
        }
        T obj = objects.get(position);
        position++;
        return obj;
    }

    @Override
    public boolean hasNextEle() {
        return position >= objects.size();
    }
}

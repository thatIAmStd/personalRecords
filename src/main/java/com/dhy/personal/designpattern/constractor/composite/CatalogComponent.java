package com.dhy.personal.designpattern.constractor.composite;

/**
 *
 * 抽象课程目录组件
 * @author ：denghaoyuan
 * @date ：create in 2020/8/8 21:39
 */
public interface CatalogComponent {

    void add(CatalogComponent catalogComponent);

    void remove(CatalogComponent catalogComponent);

    Integer getPrice();

    String getName();

    void print();

}

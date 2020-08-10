package com.dhy.personal.designpattern.constractor.composite;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/8 21:47
 */
public class Course implements CatalogComponent {
    private String name;
    private Integer price;

    public Course(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("课程内容：" + name + "，课程价格：" + price);
    }
}

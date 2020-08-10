package com.dhy.personal.designpattern.constractor.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/8 21:41
 */
public class Catalog implements CatalogComponent {
    private List<CatalogComponent> list = Lists.newArrayList();
    private String name;
    private Integer level;

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        this.list.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        this.list.remove(catalogComponent);
    }

    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("目录：" + this.name);
        for (CatalogComponent catalogComponent : list) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            catalogComponent.print();
        }
    }
}

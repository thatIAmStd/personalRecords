package com.dhy.personal.designpattern.constractor.composite;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/8 21:48
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent mainCatalog = new Catalog("课程主目录", 1);
        CatalogComponent linuxClass = new Course("linux课程", 20);
        CatalogComponent windowsClass = new Course("windows课程", 20);
        mainCatalog.add(linuxClass);
        mainCatalog.add(windowsClass);

        CatalogComponent languageCatalog = new Catalog("编程语言", 2);
        mainCatalog.add(languageCatalog);

        CatalogComponent javaCourse = new Course("java课程", 300);
        CatalogComponent pythonCourse = new Course("python课程", 300);
        languageCatalog.add(javaCourse);
        languageCatalog.add(pythonCourse);

        mainCatalog.print();
    }
}

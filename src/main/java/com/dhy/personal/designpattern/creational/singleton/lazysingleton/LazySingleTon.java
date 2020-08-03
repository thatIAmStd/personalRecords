package com.dhy.personal.designpattern.creational.singleton.lazysingleton;

/**
 * 懒汉式单例模式
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 20:29
 */
public class LazySingleTon {

    private static LazySingleTon lazySingleTon = null;

    private LazySingleTon() {

        //防止反射攻击
        if (lazySingleTon != null) {
            throw new RuntimeException("单例模式，私有构造函数不能调用");
        }
    }

    public static synchronized LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }
}

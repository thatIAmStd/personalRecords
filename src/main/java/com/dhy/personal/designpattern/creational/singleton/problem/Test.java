package com.dhy.personal.designpattern.creational.singleton.problem;

import com.dhy.personal.designpattern.creational.singleton.enumsingleton.EnumSingleton;
import com.dhy.personal.designpattern.creational.singleton.hungry.HungrySingleton;
import com.dhy.personal.designpattern.creational.singleton.lazysingleton.LazySingleTon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 21:59
 */
public class Test {

    public static void main(String[] args) throws Exception {

        //1. 序列化和反序列问题，增加readResolve方法
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

//        2. 反射攻击
//        LazySingleTon lazySingleTon1 = LazySingleTon.getInstance();
//        Class c = LazySingleTon.class;
//        Constructor constructor = c.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleTon lazySingleTon2 = (LazySingleTon) constructor.newInstance();
//        System.out.println(lazySingleTon1);
//        System.out.println(lazySingleTon2);

//        3.枚举类单例
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        enumSingleton.printTest();
    }
}

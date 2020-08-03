package com.dhy.personal.designpattern.creational.singleton.lazysingleton;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 20:30
 */
public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            LazySingleTon lazySingleTon = LazySingleTon.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+lazySingleTon);
        });

        Thread t2 = new Thread(()->{
            LazySingleTon lazySingleTon = LazySingleTon.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+lazySingleTon);
        });

        t1.start();
        t2.start();
        System.out.println("test end");
    }
}

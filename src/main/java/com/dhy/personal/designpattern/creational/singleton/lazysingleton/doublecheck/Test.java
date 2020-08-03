package com.dhy.personal.designpattern.creational.singleton.lazysingleton.doublecheck;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 20:30
 */
public class Test { 

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            LazyDoubleCheckSingleTon lazyDoubleCheckSingleTon = LazyDoubleCheckSingleTon.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+ lazyDoubleCheckSingleTon);
        });

        Thread t2 = new Thread(()->{
            LazyDoubleCheckSingleTon lazyDoubleCheckSingleTon = LazyDoubleCheckSingleTon.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+ lazyDoubleCheckSingleTon);
        });

        t1.start();
        t2.start();
        System.out.println("test end");
    }
}

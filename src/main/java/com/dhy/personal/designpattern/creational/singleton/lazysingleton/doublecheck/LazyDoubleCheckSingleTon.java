package com.dhy.personal.designpattern.creational.singleton.lazysingleton.doublecheck;

/**
 * 懒汉式单例模式
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 20:29
 */
public class LazyDoubleCheckSingleTon {

    private static volatile LazyDoubleCheckSingleTon lazyDoubleCheckSingleTon = null;

    private LazyDoubleCheckSingleTon(){}

    public static LazyDoubleCheckSingleTon getInstance(){
        if(lazyDoubleCheckSingleTon == null){
            synchronized (LazyDoubleCheckSingleTon.class){
                if(lazyDoubleCheckSingleTon == null){
                    lazyDoubleCheckSingleTon = new LazyDoubleCheckSingleTon();

                    //1.分配内存给对象
                    //3.设置LazyDoubleCheckSingleTon指向分配的内存
                    //2.初始化对象
//                    --------------------// 这里可能进行指令重排序导致其他线程使用的对象可能为初始化完成
                }
            }
        }
        return lazyDoubleCheckSingleTon;
    }
}

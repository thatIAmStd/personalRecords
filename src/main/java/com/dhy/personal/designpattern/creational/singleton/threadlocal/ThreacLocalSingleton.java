package com.dhy.personal.designpattern.creational.singleton.threadlocal;

/**
 * 每个线程里面一个单例，空间换时间
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/4 20:38
 */
public class ThreacLocalSingleton {

    private static final ThreadLocal<ThreacLocalSingleton> threacLocalSingletonThreadLocal = new ThreadLocal<ThreacLocalSingleton>() {
        @Override
        protected ThreacLocalSingleton initialValue() {
            return new ThreacLocalSingleton();
        }
    };

    private ThreacLocalSingleton() {
    }

    public static ThreacLocalSingleton getInstance() {
        return threacLocalSingletonThreadLocal.get();
    }
}

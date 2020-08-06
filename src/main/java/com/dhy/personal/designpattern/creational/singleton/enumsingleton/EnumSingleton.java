package com.dhy.personal.designpattern.creational.singleton.enumsingleton;

/**
 * effect in java 推荐的最近单例模式实现
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/4 19:52
 */
public enum EnumSingleton {

    INSTANCE {

        public void printTest() {
            System.out.println("hello");
        }
    };
    private static Object data;

    public abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        EnumSingleton.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}

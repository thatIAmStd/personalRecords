package com.dhy.personal.designpattern.creational.singleton.hungry.staticinner;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 21:33
 */
public class StaticInnerSingleTon {

    private StaticInnerSingleTon() {

    }

    private static class innerClass {
        private static StaticInnerSingleTon staticInnerSingleTon = new StaticInnerSingleTon();
    }

    public static StaticInnerSingleTon getInstance() {
        return innerClass.staticInnerSingleTon;
    }
}

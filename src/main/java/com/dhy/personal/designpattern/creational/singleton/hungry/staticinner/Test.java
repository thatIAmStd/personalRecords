package com.dhy.personal.designpattern.creational.singleton.hungry.staticinner;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 21:34
 */
public class Test {

    public static void main(String[] args) {
        StaticInnerSingleTon staticInnerSingleTon = StaticInnerSingleTon.getInstance();
        System.out.println(staticInnerSingleTon);
    }
}

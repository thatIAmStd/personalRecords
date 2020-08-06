package com.dhy.personal.designpattern.constractor.decorator.v1;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 21:36
 */
public class Test {

    public static void main(String[] args) {
        Man man = new CookMan();
        System.out.println(man.work() + "     得到 " + man.getMoney() + "元");
    }
}

package com.dhy.personal.designpattern.behavioral.templatemethod;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/13 16:25
 */
public class Test {

    public static void main(String[] args) {
        PlayConcert rockConcert = new RockConcert();
        rockConcert.doPlayConcert();

        System.out.println("----------------------");
        PlayConcert classicalConcert = new ClassicalConcert();
        classicalConcert.doPlayConcert();
    }
}

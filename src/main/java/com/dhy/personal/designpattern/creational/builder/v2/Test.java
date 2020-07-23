package com.dhy.personal.designpattern.creational.builder.v2;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 18:52
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildName("java").buildQuestion("noQuestion").buildTeacher("wang").build();
        System.out.println(course);
    }


}

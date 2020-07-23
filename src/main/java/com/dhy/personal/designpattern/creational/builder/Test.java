package com.dhy.personal.designpattern.creational.builder;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 17:27
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new JavaCourseBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("java课程", "no question", "jack");

        System.out.println(course);

    }
}

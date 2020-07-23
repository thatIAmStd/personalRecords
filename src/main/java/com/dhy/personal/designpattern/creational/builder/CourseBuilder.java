package com.dhy.personal.designpattern.creational.builder;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 17:19
 */
public interface CourseBuilder {

    void buildName(String name);

    void buildQuestion(String question);

    void buildTeacher(String teacher);

    Course makeCourse();
}

package com.dhy.personal.designpattern.creational.builder;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 17:22
 */
public class JavaCourseBuilder implements CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public void buildQuestion(String question) {
        course.setQuestion(question);
    }

    @Override
    public void buildTeacher(String teacher) {
        course.setTeacher(teacher);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}

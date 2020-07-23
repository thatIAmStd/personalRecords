package com.dhy.personal.designpattern.creational.builder;

import lombok.Data;

/**
 * 教练，用于客户端调用，与具体的CourseBuilder 解耦
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 17:24
 */
@Data
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String question, String teacher) {
        this.courseBuilder.buildName(name);
        this.courseBuilder.buildQuestion(question);
        this.courseBuilder.buildTeacher(teacher);
        return this.courseBuilder.makeCourse();
    }

}

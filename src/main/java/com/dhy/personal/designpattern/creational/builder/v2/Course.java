package com.dhy.personal.designpattern.creational.builder.v2;

import lombok.Data;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/7/23 18:45
 */
@Data
public class Course {
    private String name;
    private String question;
    private String teacher;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.question = courseBuilder.question;
        this.teacher = courseBuilder.teacher;
    }

    public static class CourseBuilder {
        private String name;
        private String question;
        private String teacher;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildQuestion(String question) {
            this.question = question;
            return this;
        }

        public CourseBuilder buildTeacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}

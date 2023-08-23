package com.github.manimovassagh.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.Objects;

public class Student extends PanacheEntity {

    private Long id;
    private String name;
    private String course;

    private Student() {
    }
//test
    private Student(Long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public static class StudentBuilder {
        private Long id;
        private String name;
        private String course;

        public StudentBuilder() {
        }

        public StudentBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public StudentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder withCourse(String course) {
            this.course = course;
            return this;
        }

        public Student build() {
            return new Student(id, name, course);
        }
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, course);
    }
}

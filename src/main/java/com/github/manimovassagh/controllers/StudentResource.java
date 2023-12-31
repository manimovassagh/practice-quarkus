package com.github.manimovassagh.controllers;


import com.github.manimovassagh.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentResource {


//mmtt


    //more controller in the
    @GetMapping(path = "/check")
    public List<Student> getStudentCheck(){
        List<Student> students=new ArrayList<>();
        Student student1=Student.builder().withId(2L).withName("Mani").withCourse("React").build();
        Student student=Student.builder().withId(3L).withName("Sahar").withCourse("Ui UX").build();
        students.add(student1);
        students.add(student);
        Student.persist(students);
        return students;
    }    //more


    @GetMapping(path = "/check")
    public List<Student> getStudentCheckToFilterAndSort(){
        List<Student> students=new ArrayList<>();
        Student student1=Student.builder().withId(2L).withName("Mani").withCourse("React").build();
        Student student=Student.builder().withId(3L).withName("Sahar").withCourse("Ui UX").build();
        students.add(student1);
        students.add(student);
        Student.persist(students);
        return students;
    }


//click
    @GetMapping(path = "/db")
    public List<Student> getFromDb(){
        return Student.listAll();
    }
}

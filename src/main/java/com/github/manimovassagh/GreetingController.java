package com.github.manimovassagh;

import com.github.manimovassagh.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String hello() {
        return "Hello Quarkus some new Items inside";
    }


//test some
    @GetMapping(path = "/student")
    public Student getStudent(){
        return Student.builder().withId(1L).withName("Sahar").withCourse("Java").build();
    }
}

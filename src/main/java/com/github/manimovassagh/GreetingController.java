package com.github.manimovassagh;

import com.github.manimovassagh.commons.ItemAdder;
import com.github.manimovassagh.commons.StringAccept;
import com.github.manimovassagh.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {


    StringAccept stringAccept;

    public GreetingController(StringAccept stringAccept) {
        this.stringAccept = stringAccept;
    }

    @GetMapping
    public String hello() {
        return "Hello Quarkus some new Items inside";
    }




    @GetMapping
    public List<StringAccept> acceptString(){
        ArrayList<StringAccept> list = new ArrayList<>();
       StringAccept accept=new StringAccept("Mani");
       StringAccept acceptInteger=new StringAccept(12);
       list.add(acceptInteger);
       list.add(accept);
       list.add(accept);
       list.add(accept);
        return  list;
    }


//test some files
    @GetMapping(path = "/student")
    public Student getStudent(){
        return Student.builder().withId(1L).withName("Sahar").withCourse("Java").build();
    }
}

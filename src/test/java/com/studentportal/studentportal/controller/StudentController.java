package com.studentportal.studentportal.controller;


import com.studentportal.studentportal.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

@CrossOrigin
public class StudentController {

    @Autowired
    StudentServiceImp studentServiceImp ;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

       return studentServiceImp.addStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){

        return studentServiceImp.getAllStudent();


    }



}

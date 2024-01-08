package com.microservice.courseservice.controller;

import com.microservice.courseservice.model.Course;
import com.microservice.courseservice.service.CourseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseServiceImp courseServiceImp ;

    @GetMapping
    public List<Course> getAll(){
        return courseServiceImp.getAll() ;
    }

}

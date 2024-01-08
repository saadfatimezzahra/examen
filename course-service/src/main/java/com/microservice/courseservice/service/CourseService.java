package com.microservice.courseservice.service;

import com.microservice.courseservice.dto.StudentDto;
import com.microservice.courseservice.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAll() ;
    public Course addCourse(Course course) ;

    public Course addStudentToCourse(StudentDto studentDto) ;
}

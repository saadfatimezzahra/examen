package com.microservice.studentservice.service;

import com.microservice.studentservice.model.Student;

import java.util.List;

public interface StudentService {

    public Student getStudentById(Long id ) ;

    public List<Student> getAll() ;

    public Student addStudent(Student student) ;
}

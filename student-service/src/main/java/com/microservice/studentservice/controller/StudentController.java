package com.microservice.studentservice.controller;

import com.microservice.studentservice.dto.StudentDto;
import com.microservice.studentservice.dto.StudentResponse;
import com.microservice.studentservice.model.Student;
import com.microservice.studentservice.service.Imp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp ;

    private WebClient.Builder webClientBuilder ;

    @GetMapping
    public List<StudentResponse> getAll(){
        List<StudentResponse> studentsResponse =new ArrayList<>();
        List<Student> students = studentServiceImp.getAll() ;
        for(int i=0 ; i< students.size() ; i++){
            StudentResponse studentResponse = new StudentResponse() ;
            studentResponse.setFirstname(students.get(i).getFirstname());
            studentResponse.setRef(students.get(i).getRef());
            studentResponse.setLastname(students.get(i).getLastname());
            studentsResponse.add(studentResponse) ;
        }
        return studentsResponse ;
    }
}

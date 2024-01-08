package com.microservice.studentservice.service.Imp;

import com.microservice.studentservice.model.Student;
import com.microservice.studentservice.repository.StudentRepository;
import com.microservice.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository ;

    private WebClient.Builder webClientBuilder ;
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {

        return null;
    }
}

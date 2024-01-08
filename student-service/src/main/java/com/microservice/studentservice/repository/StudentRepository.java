package com.microservice.studentservice.repository;

import com.microservice.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByFirsname(String firstname ) ;

}

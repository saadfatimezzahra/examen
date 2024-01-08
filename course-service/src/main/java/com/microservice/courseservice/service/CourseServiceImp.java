package com.microservice.courseservice.service;

import com.microservice.courseservice.dto.StudentDto;
import com.microservice.courseservice.model.Course;
import com.microservice.courseservice.model.Student;
import com.microservice.courseservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class CourseServiceImp implements  CourseService{
    @Autowired
    private CourseRepository repository ;

    private WebClient.Builder webClientBuilder ;
    @Override
    public List<Course> getAll() {
        return repository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public Course addStudentToCourse(StudentDto studentDto) {
        List<StudentDto>  students = (List<StudentDto>) webClientBuilder.build().get()
                .uri("http://student-service/student")
                .retrieve()
                .bodyToMono(Student.class)
                .block();

        if(!students.contains(studentDto)){
            System.out.println("student does not existe");
        }else{

        }

        return null;
    }
}

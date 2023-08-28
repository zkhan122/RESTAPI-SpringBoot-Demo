package com.example.RESTAPISpringBootDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // make StudentService a SpringService/Bean meaning it needs to be instantiated (can also use Bean)
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired // dependency injection of studentRepository as parameter
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping  //- GET endpoint
    public List<Student> getStudents() {
        return studentRepository.findAll(); // returns list to us
    }
}

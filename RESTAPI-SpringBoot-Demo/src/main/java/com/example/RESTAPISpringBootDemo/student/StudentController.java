package com.example.RESTAPISpringBootDemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired /* now studentService instance variable will be instantiated as
                 parameter into StudentController constructor as **DEPENDENCY INJECTION** */

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping  //- GET endpoint
     public List<Student> getStudents() {
        return studentService.getStudents();
    }
}

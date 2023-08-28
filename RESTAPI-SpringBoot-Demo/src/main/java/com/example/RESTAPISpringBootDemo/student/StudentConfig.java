package com.example.RESTAPISpringBootDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(
                    "Zayaan",
                    "zayaankashif@yahoo.com",
                    LocalDate.of(2004, Month.JANUARY, 20));

            Student student2 = new Student(
                    "Bob",
                    "bobthebuilder@fixit.com",
                    LocalDate.of(1998, Month.MARCH, 12));

            Student student3 = new Student(
                    "Jill",
                    "jill@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 8));

            repository.saveAll(List.of(student1, student2, student3));
        };
    }
}

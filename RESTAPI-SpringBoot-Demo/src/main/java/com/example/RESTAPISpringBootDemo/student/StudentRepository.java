package com.example.RESTAPISpringBootDemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Class to access database (Data Access Layer) for JPA
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { // id is type Long

}

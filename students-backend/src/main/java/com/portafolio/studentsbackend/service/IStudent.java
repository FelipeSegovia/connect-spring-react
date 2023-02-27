package com.portafolio.studentsbackend.service;

import com.portafolio.studentsbackend.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IStudent {

    Student create(Student student);
    List<Student> getAll();
    Student findStudentById(Integer id);


}

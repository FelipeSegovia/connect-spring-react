package com.portafolio.studentsbackend.service;

import com.portafolio.studentsbackend.model.Student;
import com.portafolio.studentsbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudent{

    @Autowired
    StudentRepository studentRepository;

    @Override

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow();
    }
}

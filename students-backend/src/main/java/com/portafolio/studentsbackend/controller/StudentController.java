package com.portafolio.studentsbackend.controller;

import com.portafolio.studentsbackend.model.Student;
import com.portafolio.studentsbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.create(student), HttpStatus.CREATED);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findOne(@PathVariable Integer id){
        Student findStudent = studentService.findStudentById(id);
        return ResponseEntity.ok(findStudent);
    }

}

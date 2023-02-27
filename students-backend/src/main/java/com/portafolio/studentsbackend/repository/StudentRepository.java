package com.portafolio.studentsbackend.repository;

import com.portafolio.studentsbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository< Student, Integer> {
}

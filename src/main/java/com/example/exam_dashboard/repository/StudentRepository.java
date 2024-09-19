package com.example.exam_dashboard.repository;

import com.example.exam_dashboard.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT COUNT(s) FROM Student s")
    int countAllStudents();
}

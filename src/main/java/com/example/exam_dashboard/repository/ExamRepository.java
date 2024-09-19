package com.example.exam_dashboard.repository;

import com.example.exam_dashboard.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExamRepository extends JpaRepository<Exam, Long> {
    @Query("SELECT COUNT(e) FROM Exam e")
    int countAllExams();
}


package com.example.exam_dashboard.repository;

import com.example.exam_dashboard.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT COUNT(q) FROM Question q")
    int countAllQuestions();
}


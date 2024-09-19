package com.example.exam_dashboard.service;

import com.example.exam_dashboard.dto.DashboardResponseDTO;
import com.example.exam_dashboard.repository.ExamRepository;
import com.example.exam_dashboard.repository.QuestionRepository;
import com.example.exam_dashboard.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public DashboardResponseDTO getDashboardData() {
        int totalStudents = studentRepository.countAllStudents();
        int totalExams = examRepository.countAllExams();
        int totalQuestions = questionRepository.countAllQuestions();

        return new DashboardResponseDTO(totalStudents, totalExams, totalQuestions);
    }
}

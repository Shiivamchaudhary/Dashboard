package com.example.exam_dashboard.dto;


public class DashboardResponseDTO {
    private int totalStudents;
    private int totalExams;
    private int totalQuestions;

    public DashboardResponseDTO(int totalStudents, int totalExams, int totalQuestions) {
        this.totalStudents = totalStudents;
        this.totalExams = totalExams;
        this.totalQuestions = totalQuestions;
    }

    // Getters and Setters
}


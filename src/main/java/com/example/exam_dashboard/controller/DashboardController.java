package com.example.exam_dashboard.controller;

import com.example.exam_dashboard.dto.ApiResponse;
import com.example.exam_dashboard.dto.DashboardResponseDTO;
import com.example.exam_dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping
    public ResponseEntity<ApiResponse<DashboardResponseDTO>> getDashboardData() {
        DashboardResponseDTO dashboardData = dashboardService.getDashboardData();
        return ResponseEntity.ok(new ApiResponse<>(true, "Data fetched successfully", dashboardData));
    }
}

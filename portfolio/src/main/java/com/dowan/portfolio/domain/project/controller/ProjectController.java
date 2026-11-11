package com.dowan.portfolio.domain.project.controller;

import com.dowan.portfolio.domain.project.dto.response.ProjectListResponse;
import com.dowan.portfolio.domain.project.service.ProjectListService;
import com.dowan.portfolio.global.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectListService projectListService;


    @GetMapping
    public ApiResponse<List<ProjectListResponse>> findAll() {
        List<ProjectListResponse> projectListResponse = projectListService.findAll();
        return ApiResponse.ok(projectListResponse);
    }
}

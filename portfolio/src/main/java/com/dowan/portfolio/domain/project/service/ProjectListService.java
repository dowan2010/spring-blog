package com.dowan.portfolio.domain.project.service;

import com.dowan.portfolio.domain.project.dto.response.ProjectListResponse;

import java.util.List;

public interface ProjectListService {
    List<ProjectListResponse> findAll();
}

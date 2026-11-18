package com.dowan.portfolio.domain.resume.controller;

import com.dowan.portfolio.domain.resume.dto.response.ResumeUrlResponse;
import com.dowan.portfolio.domain.resume.service.ResumeUrlService;
import com.dowan.portfolio.global.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/resume")
public class ResumeController {
    private final ResumeUrlService resumeUrlService;

    @GetMapping
    public ApiResponse<ResumeUrlResponse> findResumeUrl() {
        ResumeUrlResponse response = resumeUrlService.findResumeUrl();
        return ApiResponse.ok(response);
    }
}

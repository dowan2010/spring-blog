package com.dowan.portfolio.domain.resume.service.impl;

import com.dowan.portfolio.domain.resume.dto.response.ResumeUrlResponse;
import com.dowan.portfolio.domain.resume.entity.Resume;
import com.dowan.portfolio.domain.resume.error.exception.ResumeUrlNotFoundException;
import com.dowan.portfolio.domain.resume.repository.ResumeRepository;
import com.dowan.portfolio.domain.resume.service.ResumeUrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ResumeUrlServiceImpl implements ResumeUrlService {
    private final ResumeRepository resumeRepository;

    @Transactional(readOnly = true)
    @Override
    public ResumeUrlResponse findResumeUrl() {

        Resume resume = resumeRepository
                .findTopByOrderByUploadedAtDesc()
                .orElseThrow(
                        () -> new ResumeUrlNotFoundException()
                );

        ResumeUrlResponse response = ResumeUrlResponse.from(resume);

        return response;
    }
}

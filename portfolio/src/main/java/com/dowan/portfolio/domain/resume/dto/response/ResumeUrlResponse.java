package com.dowan.portfolio.domain.resume.dto.response;

import com.dowan.portfolio.domain.resume.entity.Resume;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResumeUrlResponse(
        String fileUrl,
        LocalDateTime uploadedAt
) {
    public static ResumeUrlResponse from(Resume resume) {
        return ResumeUrlResponse.builder()
                .fileUrl(resume.getFileUrl())
                .uploadedAt(resume.getUploadedAt())
                .build();
    }
}

package com.dowan.portfolio.domain.project.dto.response;

import com.dowan.portfolio.domain.project.entity.Project;
import com.dowan.portfolio.domain.skill.dto.response.SkillListResponse;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record ProjectListResponse (
        Long id,
        String title,
        String description,
        String githubUrl,
        String demoUrl,
        String imageUrl,
        LocalDate startDate,
        LocalDate endDate,
        List<SkillListResponse> skill
) {
    public static ProjectListResponse from(Project project, List<SkillListResponse> skill) {
        return ProjectListResponse.builder()
                .id(project.getId())
                .title(project.getTitle())
                .description(project.getDescription())
                .githubUrl(project.getGithubUrl())
                .demoUrl(project.getDemoUrl())
                .imageUrl(project.getImageUrl())
                .startDate(project.getStartDate())
                .endDate(project.getEndDate())
                .skill(skill)
                .build();
    }
}
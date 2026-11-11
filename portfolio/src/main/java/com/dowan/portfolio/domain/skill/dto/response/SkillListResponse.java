package com.dowan.portfolio.domain.skill.dto.response;

import com.dowan.portfolio.domain.skill.entity.Category;
import com.dowan.portfolio.domain.skill.entity.Skill;
import lombok.Builder;

@Builder
public record SkillListResponse(
        long id,

        String name,

        Category category,

        String iconUrl,

        int displayOrder
) {

    public static SkillListResponse from(Skill skill) {
        return SkillListResponse.builder()
                .id(skill.getId())
                .name(skill.getName())
                .category(skill.getCategory())
                .iconUrl(skill.getIconUrl())
                .displayOrder(skill.getDisplayOrder())
                .build();
    }
}

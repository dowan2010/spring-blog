package com.dowan.portfolio.domain.skill.dto.response;

import com.dowan.portfolio.domain.skill.entity.Category;
import com.dowan.portfolio.domain.skill.entity.Skill;

public record SkillListResponse(
        long id,

        String name,

        Category category,

        String iconUrl,

        int displayOrder
) {

    public static SkillListResponse from(Skill skill) {
        return new SkillListResponse(skill.getId(), skill.getName(), skill.getCategory(), skill.getIconUrl(), skill.getDisplayOrder());
    }
}

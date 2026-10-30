package com.dowan.portfolio.domain.skill.service;

import com.dowan.portfolio.domain.skill.dto.response.SkillListResponse;

import java.util.List;

public interface SkillService {
    List<SkillListResponse> findAllSkill();
}

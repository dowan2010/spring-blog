package com.dowan.portfolio.domain.skill.controller;

import com.dowan.portfolio.domain.skill.dto.response.SkillListResponse;
import com.dowan.portfolio.domain.skill.service.SkillService;
import com.dowan.portfolio.global.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/skills")
public class SkillController {
    private final SkillService skillService;

    @GetMapping
    public ApiResponse<List<SkillListResponse>> findAllSkill() {
        List<SkillListResponse> response = skillService.findAllSkill();
        return ApiResponse.ok(response);
    }

}

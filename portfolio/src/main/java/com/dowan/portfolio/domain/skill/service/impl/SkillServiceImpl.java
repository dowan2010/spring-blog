package com.dowan.portfolio.domain.skill.service.impl;

import com.dowan.portfolio.domain.skill.dto.response.SkillListResponse;
import com.dowan.portfolio.domain.skill.repository.SkillRepository;
import com.dowan.portfolio.domain.skill.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;

    @Override
    public List<SkillListResponse> findAllSkill() {
        return skillRepository.findAllByOrderByDisplayOrderAsc()
                .stream()
                .map(SkillListResponse::from)
                .collect(Collectors.toList());
    }
}

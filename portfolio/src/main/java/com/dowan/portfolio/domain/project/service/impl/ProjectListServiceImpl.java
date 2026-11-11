package com.dowan.portfolio.domain.project.service.impl;

import com.dowan.portfolio.domain.project.dto.response.ProjectListResponse;
import com.dowan.portfolio.domain.project.entity.Project;
import com.dowan.portfolio.domain.project.entity.ProjectSkill;
import com.dowan.portfolio.domain.project.repository.ProjectRepository;
import com.dowan.portfolio.domain.project.repository.ProjectSkillRepository;
import com.dowan.portfolio.domain.project.service.ProjectListService;
import com.dowan.portfolio.domain.skill.dto.response.SkillListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProjectListServiceImpl implements ProjectListService {
    private final ProjectRepository projectRepository;
    private final ProjectSkillRepository projectSkillRepository;

    @Override
    public List<ProjectListResponse> findAll() {
//        List<Project> projects = projectRepository.findAllByOrderByDisplayOrderAsc();
//
//        List<ProjectListResponse> result = new ArrayList<>();          // ① 응답을 담을 빈 상자
//
//        for (Project project : projects) {                             // ② 프로젝트를 하나씩 꺼낸다
//            List<ProjectSkill> projectSkills =
//                    projectSkillRepository.findAllByProject(project);     // ③ 이 프로젝트의 주문서 줄들
//
//            List<SkillListResponse> skills = new ArrayList<>();        // ④ 기술을 담을 빈 상자
//            for (ProjectSkill projectSkill : projectSkills) {          // ⑤ 주문서 줄을 하나씩 꺼낸다
//                skills.add(SkillListResponse.from(projectSkill.getSkill()));  // ⑥ 줄에서 기술을 꺼내 응답용으로 바꿔 담는다
//            }
//
//            result.add(ProjectListResponse.from(project, skills));    // ⑦ 프로젝트 + 기술 = 응답 하나
//        }
//
//        return result;                                           // ⑧ 다 모은 상자를 돌려준다
        List<Project> projects = projectRepository.findAllByOrderByDisplayOrderAsc();
        List<ProjectListResponse> responses = projects.stream()
                .map(
                project -> {
                    List<ProjectSkill> projectSkills = projectSkillRepository.findAllByProject(project);

                    List<SkillListResponse> skills = projectSkills
                            .stream()
                            .map(ProjectSkill ->
                                    SkillListResponse.from(ProjectSkill.getSkill())
                            )
                            .toList();

                    ProjectListResponse response = ProjectListResponse.from(project, skills);
                    return response;
                }
        ).toList();
        return responses;
    }
}

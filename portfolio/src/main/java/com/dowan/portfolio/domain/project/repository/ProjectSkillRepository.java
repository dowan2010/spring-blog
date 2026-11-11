package com.dowan.portfolio.domain.project.repository;

import com.dowan.portfolio.domain.project.entity.Project;
import com.dowan.portfolio.domain.project.entity.ProjectSkill;
import com.dowan.portfolio.domain.project.entity.ProjectSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectSkillRepository extends JpaRepository<ProjectSkill, ProjectSkillId> {
    List<ProjectSkill> findAllByProject(Project project);
}

package com.dowan.portfolio.domain.project.entity;

import com.dowan.portfolio.domain.skill.entity.Skill;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "project_skills")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProjectSkill {
    // 엔티티 클래스 또는 매핑된 슈퍼클래스의 어노테이션이 지정된 영속 필드나 속성이 해당 엔티티의 복합 기본 키임을 지정합니다.
    @EmbeddedId
    private ProjectSkillId id;

    @ManyToOne(targetEntity = Project.class)
    @MapsId(value = "projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(targetEntity = Skill.class)
    @MapsId(value = "skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;
}

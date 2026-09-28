package com.dowan.portfolio.domain.project.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjectSkillId implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProjectSkillId that = (ProjectSkillId) o;
        return Objects.equals(projectId, that.projectId) && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, skillId);
    }

    private Long projectId;

    private Long skillId;
}

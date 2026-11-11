package com.dowan.portfolio.domain.project.repository;

import com.dowan.portfolio.domain.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAllByOrderByDisplayOrderAsc();// projects를 display_order기준으로 오름차순 정렬하여 전체 리턴
}

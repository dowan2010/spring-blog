package com.dowan.portfolio.domain.resume.repository;

import com.dowan.portfolio.domain.resume.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    Optional<Resume> findTopByOrderByUploadedAtDesc();
}

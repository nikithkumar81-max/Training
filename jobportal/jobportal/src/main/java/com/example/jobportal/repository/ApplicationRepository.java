package com.example.jobportal.repository;

import com.example.jobportal.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    void deleteByJobId(Long jobId);

    void deleteByCandidateId(Long candidateId);
}
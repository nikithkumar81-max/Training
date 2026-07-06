package com.example.jobportal.service;

import com.example.jobportal.entity.Application;
import com.example.jobportal.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository repository;

    public List<Application> getAllApplications() {
        return repository.findAll();
    }

    public Application saveApplication(Application application) {
        return repository.save(application);
    }

    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }

    public void deleteApplicationsByJobId(Long jobId) {
        repository.deleteByJobId(jobId);
    }

    public void deleteApplicationsByCandidateId(Long candidateId) {
        repository.deleteByCandidateId(candidateId);
    }
}
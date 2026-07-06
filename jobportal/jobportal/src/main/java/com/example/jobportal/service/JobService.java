package com.example.jobportal.service;

import com.example.jobportal.entity.Job;
import com.example.jobportal.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository repository;

    public List<Job> getAllJobs() {
        return repository.findAll();
    }

    public Job getJobById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Job saveJob(Job job) {
        return repository.save(job);
    }

    public void deleteJob(Long id) {
        repository.deleteById(id);
    }
}
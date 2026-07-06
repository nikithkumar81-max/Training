package com.example.jobportal.service;

import com.example.jobportal.entity.Candidate;
import com.example.jobportal.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository repository;

    public List<Candidate> getAllCandidates() {
        return repository.findAll();
    }

    public Candidate getCandidateById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Candidate saveCandidate(Candidate candidate) {
        return repository.save(candidate);
    }

    public void deleteCandidate(Long id) {
        repository.deleteById(id);
    }
}
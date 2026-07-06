package com.example.jobportal.controller;

import com.example.jobportal.entity.Candidate;
import com.example.jobportal.service.ApplicationService;
import com.example.jobportal.service.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateService candidateService;
    private final ApplicationService applicationService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("candidate", new Candidate());
        return "candidate-register";
    }

    @PostMapping("/save")
    public String saveCandidate(@ModelAttribute Candidate candidate) {
        candidateService.saveCandidate(candidate);
        return "redirect:/candidates/list";
    }

    @GetMapping("/list")
    public String listCandidates(Model model) {
        model.addAttribute("candidates", candidateService.getAllCandidates());
        return "candidate-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteCandidate(@PathVariable Long id) {
        applicationService.deleteApplicationsByCandidateId(id);
        candidateService.deleteCandidate(id);
        return "redirect:/candidates/list";
    }
}
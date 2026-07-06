package com.example.jobportal.controller;

import com.example.jobportal.entity.Application;
import com.example.jobportal.entity.Candidate;
import com.example.jobportal.entity.Job;
import com.example.jobportal.service.ApplicationService;
import com.example.jobportal.service.CandidateService;
import com.example.jobportal.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;
    private final CandidateService candidateService;
    private final JobService jobService;

    @GetMapping("/apply")
    public String showApplyForm(Model model) {
        model.addAttribute("candidates", candidateService.getAllCandidates());
        model.addAttribute("jobs", jobService.getAllJobs());
        return "apply-job";
    }

    @PostMapping("/save")
    public String saveApplication(@RequestParam("candidateId") Long candidateId,
                                  @RequestParam("jobId") Long jobId,
                                  Model model) {

        Candidate candidate = candidateService.getCandidateById(candidateId);
        Job job = jobService.getJobById(jobId);

        if (candidate == null || job == null) {
            model.addAttribute("error", "Candidate or Job not found.");
            model.addAttribute("candidates", candidateService.getAllCandidates());
            model.addAttribute("jobs", jobService.getAllJobs());
            return "apply-job";
        }

        Application application = new Application();
        application.setCandidate(candidate);
        application.setJob(job);
        application.setAppliedDate(LocalDate.now());
        application.setStatus("APPLIED");

        applicationService.saveApplication(application);

        return "redirect:/applications/list";
    }

    @GetMapping("/list")
    public String listApplications(Model model) {
        model.addAttribute("applications", applicationService.getAllApplications());
        return "application-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return "redirect:/applications/list";
    }
}
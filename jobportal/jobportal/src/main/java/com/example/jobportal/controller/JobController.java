package com.example.jobportal.controller;

import com.example.jobportal.entity.Job;
import com.example.jobportal.service.ApplicationService;
import com.example.jobportal.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/jobs")
public class JobController {

    private final JobService service;
    private final ApplicationService applicationService;

    @GetMapping("/add")
    public String showJobForm(Model model) {
        model.addAttribute("job", new Job());
        return "job-form";
    }

    @PostMapping("/save")
    public String saveJob(@ModelAttribute Job job) {
        service.saveJob(job);
        return "redirect:/jobs/list";
    }

    @GetMapping("/list")
    public String listJobs(Model model) {
        model.addAttribute("jobs", service.getAllJobs());
        return "job-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteJob(@PathVariable Long id) {
        applicationService.deleteApplicationsByJobId(id);
        service.deleteJob(id);
        return "redirect:/jobs/list";
    }
}
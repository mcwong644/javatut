package com.embarkx.firstjobapp.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JobController {
    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobs;
    }

    @PostMapping("/jobs")
    public String CreateJobs(@RequestBody Job job) {
        jobs.add(job);
        return "Job Added successfully";
        
        
    }
    

}

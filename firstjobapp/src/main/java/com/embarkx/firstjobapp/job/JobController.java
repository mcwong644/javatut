package com.embarkx.firstjobapp.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class JobController {
    // private List<Job> jobs = new ArrayList<>();
    // moved to JobServiceImpl.java

    private JobService jobService;

    // constructor injection (right click on the constructor and select "Generate constructor")
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String CreateJobs(@RequestBody Job job) {
        // jobs.add(job);
        jobService.createJob(job);
        return "Job Added successfully";

    }

}

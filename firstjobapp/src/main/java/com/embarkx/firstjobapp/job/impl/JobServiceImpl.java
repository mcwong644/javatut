package com.embarkx.firstjobapp.job.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.embarkx.firstjobapp.job.Job;
import com.embarkx.firstjobapp.job.JobService;

@Service
public class JobServiceImpl implements JobService {
private List<Job> jobs = new ArrayList<>();
Long id = 1L;

    @Override
    public List<Job> findAll() {
        return jobs;
        //throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void createJob(Job job) {
        job.setId(id++);
        jobs.add(job);
        // throw new UnsupportedOperationException("Unimplemented method 'createJob'");
    }

}

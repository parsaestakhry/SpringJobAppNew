package com.parsa.springjobappnew.controller;


import com.parsa.springjobappnew.model.JobPost;
import com.parsa.springjobappnew.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService jobService;



    @GetMapping("/jobPosts")
//    tells spring to return as JSON value
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return jobService.getAllJobs();
    }


    @GetMapping("job/{jobId}")
    @ResponseBody
    public JobPost getJob(@PathVariable("jobId") int jobId){
        return jobService.getJob(jobId);
    }


    @PostMapping("addjob")
    public void addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }

    @PutMapping("updatejob")
    public JobPost updateJob(JobPost jobPost){
            return jobService.updateJob(jobPost);
    }

    @DeleteMapping("deletejob/{jobId}")
    public String deleteJob(@PathVariable("jobId") int jobId){
        return jobService.deleteJob(jobId);
    }



}

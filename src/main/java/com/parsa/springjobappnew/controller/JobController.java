package com.parsa.springjobappnew.controller;


import com.parsa.springjobappnew.model.JobPost;
import com.parsa.springjobappnew.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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


    @GetMapping("job/3")
    @ResponseBody
    public JobPost getJob(){
        return jobService.getJob(3);
    }
}

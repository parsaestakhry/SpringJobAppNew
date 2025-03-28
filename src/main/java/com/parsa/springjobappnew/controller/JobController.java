package com.parsa.springjobapp.controller;


import com.parsa.springjobapp.model.jobPost;
import com.parsa.springjobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;


    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob(){
        return "addjob";
    }


    @RequestMapping(value = "/handleForm", method = RequestMethod.POST)
    public String handleForm(jobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }

    @RequestMapping(value = "/viewalljobs", method = RequestMethod.GET)
    public String viewAllJobs(Model model){
        List<jobPost> jobPosts = jobService.getAllJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }
}

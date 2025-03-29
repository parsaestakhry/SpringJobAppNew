package com.parsa.springjobappnew.service;




import com.parsa.springjobappnew.model.JobPost;
import com.parsa.springjobappnew.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public void addJob(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }

    public JobPost getJob(int i) {
        return jobRepository.getJob(i);
    }

    public JobPost updateJob(JobPost jobPost) {
        return jobRepository.updateJob(jobPost);
    }

    public String deleteJob(int id){
        return jobRepository.deleteJob(id);
    }
}

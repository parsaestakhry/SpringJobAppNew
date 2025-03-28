package com.parsa.springjobappnew.repository;

import com.parsa.springjobappnew.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Java Developer with 2 years of experience", 2, Arrays.asList("Java", "Spring Boot", "Hibernate")),
            new  JobPost(2, "Python Developer", "Python Developer with 2 years of experience", 2, Arrays.asList("Python", "Django", "Flask")),
            new  JobPost(3, "React Developer", "React Developer with 2 years of experience", 2, Arrays.asList("React", "Redux", "Javascript")),
            new  JobPost(4, "Angular Developer", "Angular Developer with 2 years of experience", 2, Arrays.asList("Angular", "Typescript", "Javascript")),
            new  JobPost(5, "Node Developer", "Node Developer with 2 years of experience", 2, Arrays.asList("Node", "Express", "Javascript")),
            new  JobPost(6, "Vue Developer", "Vue Developer with 2 years of experience", 2, Arrays.asList("Vue", "Vuex", "Javascript")),
            new  JobPost(7, "Ruby Developer", "Ruby Developer with 2 years of experience", 2, Arrays.asList("Ruby", "Rails", "Javascript")),
            new  JobPost(8, "PHP Developer", "PHP Developer with 2 years of experience", 2, Arrays.asList("PHP", "Laravel", "Javascript")),
            new  JobPost(9, "C# Developer", "C# Developer with 2 years of experience", 2, Arrays.asList("C#", ".NET", "Javascript")),
            new  JobPost(10, "C++ Developer", "C++ Developer with 2 years of experience", 2, Arrays.asList("C++", "QT", "Javascript"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob( JobPost jobPost){
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int i) {
        for (JobPost job:jobs){
            if (job.getPostId() == i){
                return job;
            }
        }
        return null;
    }
}

package com.online_portal.demo.services.impl;

import com.online_portal.demo.models.UserModel;
import com.online_portal.demo.repository.JobRepository;
import com.online_portal.demo.repository.UserRepository;
import com.online_portal.demo.services.JobService;
import com.online_portal.demo.models.JobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class JobServiceImpl implements JobService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void postNewJob(JobModel job) {
        jobRepository.save(job);
    }

    @Override
    public void updateJob(JobModel jobModel) {
        JobModel job=null;
        Optional<JobModel> jobExist=jobRepository.findById(jobModel.getJobID());
        if(jobExist.isPresent()){
            job=jobExist.get();
            job.setLocation(jobModel.getLocation());
            job.setDesignation(jobModel.getDesignation());
            job.setEmploymentType(jobModel.getEmploymentType());
            job.setResponsibility(jobModel.getResponsibility());
            jobRepository.save(job);
        }
    }

    @Override
    public void deleteJob(long jobID) {
        jobRepository.deleteById(jobID);
    }

    @Override
    public List<JobModel> fetchJobByUser(long userID) {
        List<JobModel> jobs=new ArrayList<>();
        Optional<UserModel> userPresent=userRepository.findById(userID);
        if(userPresent.isPresent()){
           jobs= userPresent.get().getJobs();

        }
        return jobs;
    }
}

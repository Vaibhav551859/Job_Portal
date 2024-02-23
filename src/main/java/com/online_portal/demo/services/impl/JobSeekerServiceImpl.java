package com.online_portal.demo.services.impl;

import com.online_portal.demo.services.JobSeekerService;
import com.online_portal.demo.models.JobModel;
import com.online_portal.demo.models.UserModel;

import com.online_portal.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class JobSeekerServiceImpl extends UserServiceImpl implements JobSeekerService {
    @Autowired
    private JobRepository jobRepository;
    @Override
    public void applyForJob(long jobID, long userID, String resume) {

    }

    @Override
    public List<JobModel> fetchAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public JobModel fetchJobByID(long jobID) {
        return jobRepository.findById(jobID);
    }

    @Override
    public List<JobModel> fetchJobByDesignation(String designation) {
        return jobRepository.findByDesignation(designation);
    }

    @Override
    public List<JobModel> fetchJobBySkills(List<String> skills) {
        return null;
    }

    @Override
    public List<JobModel> fetchJobsByCompany(String company) {
        return null;
    }

    @Override
    public List<JobModel> fetchJobsByLocation(String location) {
        return null;
    }

    @Override
    public List<JobModel> fetchJobsByExperience(int expYrs) {
        List<JobModel> jobs= jobRepository.findByExp(expYrs);
        return jobs;
    }


}

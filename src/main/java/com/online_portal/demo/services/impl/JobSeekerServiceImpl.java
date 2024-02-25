package com.online_portal.demo.services.impl;

import com.online_portal.demo.services.JobSeekerService;
import com.online_portal.demo.models.JobModel;

import com.online_portal.demo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerServiceImpl extends UserServiceImpl implements JobSeekerService {
    @Autowired
    private JobRepository jobRepository;

    @Override
    public void applyForJob(long jobID, long userID) {
        fetchJobByID(jobID);
    }
    @Override
    public List<JobModel> fetchAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public JobModel fetchJobByID(long jobID) {
        JobModel job=null;
        Optional<JobModel> op=jobRepository.findById(jobID);
        if(op.isPresent()){
            job= op.get();
        }
        return job;
    }

    @Override
    public List<JobModel> fetchJobByDesignation(String designation) {
        return jobRepository.findByDesignation(designation);
    }

    @Override
    public List<JobModel> fetchJobBySkills(List<String> skills) {
        List<JobModel> skill=null;
        Optional<JobModel> BySkill=jobRepository.findBySkill(skills);
        if(BySkill.isPresent()){
            skill.add(BySkill.get());
        }
        return skill;
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

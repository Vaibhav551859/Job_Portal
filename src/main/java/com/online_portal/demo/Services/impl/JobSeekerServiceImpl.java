package com.online_portal.demo.Services.impl;

import com.online_portal.demo.Services.JobSeekerService;
import com.online_portal.demo.models.JobModel;
import com.online_portal.demo.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class JobSeekerServiceImpl implements JobSeekerService {
    @Override
    public void applyForJob(long jobID, long userID, String resume) {

    }

    @Override
    public List<JobModel> fetchAllJobs() {
        return null;
    }

    @Override
    public List<JobModel> fetchJobByID(long jobID) {
        return null;
    }

    @Override
    public List<JobModel> fetchJobByDesignation(String designation) {
        return null;
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
        return null;
    }

    @Override
    public void createUser(UserModel user) {

    }

    @Override
    public void updateProfile(long userID) {

    }
}

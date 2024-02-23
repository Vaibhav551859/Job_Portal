package com.online_portal.demo.services;

import com.online_portal.demo.models.JobModel;

import java.util.List;

public interface JobSeekerService extends UserService{
    void applyForJob(long jobID, long userID, String resume);
    List<JobModel> fetchAllJobs();
    JobModel fetchJobByID(long jobID);
    List<JobModel> fetchJobByDesignation(String designation);
    List<JobModel> fetchJobBySkills(List<String> skills);
    List<JobModel> fetchJobsByCompany(String company);
    List<JobModel> fetchJobsByLocation(String location);
    List<JobModel> fetchJobsByExperience(int expYrs);
}

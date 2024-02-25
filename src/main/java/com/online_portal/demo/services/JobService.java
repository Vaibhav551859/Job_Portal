package com.online_portal.demo.services;

import com.online_portal.demo.models.JobModel;

import java.util.List;

public interface JobService {
    void postNewJob(JobModel job);
    void updateJob(JobModel job);
    void deleteJob(long jobID);
    List<JobModel> fetchJobByUser(long userID);

}

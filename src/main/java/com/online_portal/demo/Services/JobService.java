package com.online_portal.demo.Services;

import com.online_portal.demo.models.JobModel;

import java.util.List;

public interface JobService {
    void postNewJob(JobModel job);
    void updateJob(long jobID);
    void deleteJob(long jobID);
    List<JobModel> fetchJobByUser(long userID);

}

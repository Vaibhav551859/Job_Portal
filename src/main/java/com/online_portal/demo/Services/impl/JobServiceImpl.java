package com.online_portal.demo.Services.impl;

import com.online_portal.demo.Services.JobService;
import com.online_portal.demo.models.JobModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobServiceImpl implements JobService {
    @Override
    public void postNewJob(JobModel job) {

    }

    @Override
    public void updateJob(long jobID) {

    }

    @Override
    public void deleteJob(long jobID) {

    }

    @Override
    public List<JobModel> fetchJobByUser(long userID) {
        return null;
    }
}

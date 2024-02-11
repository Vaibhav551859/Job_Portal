package com.online_portal.demo.Services;

import com.online_portal.demo.models.JobModel;

public interface EmployerService extends UserService{
    void postJob(JobModel job);

}

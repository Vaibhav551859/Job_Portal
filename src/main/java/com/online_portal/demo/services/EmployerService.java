package com.online_portal.demo.services;

import com.online_portal.demo.models.JobModel;

public interface EmployerService extends UserService{
    void postJob(JobModel job);

}

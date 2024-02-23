package com.online_portal.demo.services.impl;

import com.online_portal.demo.services.EmployerService;
import com.online_portal.demo.models.JobModel;
import org.springframework.stereotype.Service;

@Service

public class EmployerServiceImpl extends UserServiceImpl implements EmployerService {
    @Override
    public void postJob(JobModel job) {

    }


}

package com.online_portal.demo.models;

import com.online_portal.demo.enums.Role;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employers")
public class EmployerModel extends UserModel{
    public EmployerModel(){
        this.setUserRole(Role.EMPLOYER);
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employer",orphanRemoval = true)
    private List<JobModel> jobs;

    public List<JobModel> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobModel> jobs) {
        this.jobs = jobs;
    }
}

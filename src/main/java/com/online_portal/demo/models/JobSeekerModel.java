package com.online_portal.demo.models;

import com.online_portal.demo.enums.Qualification;
import com.online_portal.demo.enums.Role;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="jobseekers")
public class JobSeekerModel extends  UserModel{
    @Enumerated(EnumType.STRING)
    private Qualification qualification;
    private List<String> skills;
   private int exp;
    @ManyToMany(mappedBy = "jobSeekers")
    private List<JobModel> jobs;
    public JobSeekerModel(){
        this.setUserRole(Role.JOB_SEEKER);
    }

    public List<JobModel> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobModel> jobs) {
        this.jobs = jobs;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}

package com.online_portal.demo.models;

import com.online_portal.demo.enums.EmploymentType;
import com.online_portal.demo.enums.Industry;
import com.online_portal.demo.enums.Qualification;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name="jobs")
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long jobID;
    private  String company;
    private String designation;
    @ElementCollection
    private List<String> skills;
    @ElementCollection
    private List<Qualification> qualifications;
    @ElementCollection
    private List<Integer> exp;
    private String responsibility;
    private String location;
    @Enumerated(EnumType.STRING)
    private Industry industry;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;
    @ManyToOne(fetch = FetchType.LAZY)
    private EmployerModel employer;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserModel user;

    @ManyToMany
    private List<JobSeekerModel> jobSeekers;

    private Timestamp publishDate;

    public EmployerModel getEmployer() {
        return employer;
    }

    public void setEmployer(EmployerModel employer) {
        this.employer = employer;
    }

    public List<JobSeekerModel> getJobSeekers() {
        return jobSeekers;
    }

    public void setJobSeekers(List<JobSeekerModel> jobSeekers) {
        this.jobSeekers = jobSeekers;
    }

    public long getJobID() {
        return jobID;
    }

    public void setJobID(long jobID) {
        this.jobID = jobID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public List<Integer> getExp() {
        return exp;
    }

    public void setExp(List<Integer> exp) {
        this.exp = exp;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }
}

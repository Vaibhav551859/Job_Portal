package com.online_portal.demo.repository;

import com.online_portal.demo.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<JobModel,Long> {
    List<JobModel> findByDesignation(String designation);

    List<JobModel> findByExp(int expYrs);
    List<JobModel> findBySkill(List<String> skills);
}

package com.online_portal.demo.repository;

import com.online_portal.demo.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobModel,Long> {
}

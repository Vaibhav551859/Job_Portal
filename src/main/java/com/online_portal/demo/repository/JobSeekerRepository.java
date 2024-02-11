package com.online_portal.demo.repository;

import com.online_portal.demo.models.JobSeekerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeekerModel,Long> {
}

package com.online_portal.demo.repository;

import com.online_portal.demo.models.EmployerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<EmployerModel,Long> {
}

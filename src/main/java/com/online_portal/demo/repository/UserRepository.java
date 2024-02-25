package com.online_portal.demo.repository;

import com.online_portal.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {

}

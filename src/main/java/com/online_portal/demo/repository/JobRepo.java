package com.online_portal.demo.repository;

import com.online_portal.demo.models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface JobRepo extends CrudRepository<UserModel,Integer> {
}

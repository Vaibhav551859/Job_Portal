package com.online_portal.demo.repository;

import com.online_portal.demo.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo {
    @Repository
    public interface JobRepo extends CrudRepository<UserModel,Integer> {

    }
}

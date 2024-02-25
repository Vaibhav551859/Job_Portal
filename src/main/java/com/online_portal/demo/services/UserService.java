package com.online_portal.demo.services;

import com.online_portal.demo.exception.UserNotFoundException;
import com.online_portal.demo.models.UserModel;

public interface UserService {
    void createUser(UserModel user) throws UserNotFoundException;


    void updateProfile(UserModel userModel);
}

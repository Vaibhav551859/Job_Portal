package com.online_portal.demo.Services;

import com.online_portal.demo.models.UserModel;

public interface UserService {
    void createUser(UserModel user);
    void updateProfile(long userID);

}

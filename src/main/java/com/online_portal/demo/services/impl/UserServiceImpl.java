package com.online_portal.demo.services.impl;

import com.online_portal.demo.models.JobModel;
import com.online_portal.demo.repository.UserRepository;
import com.online_portal.demo.services.UserService;
import com.online_portal.demo.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserRepository userRepository;
    @Override
    public void createUser(UserModel user) {
        List<UserModel> userDetails = userRepository.findAll();
        if(userDetails.contains(user.getUserID()))
        {
            System.out.println("user id already exit"+user.getUserID());
        }
        else {
            userRepository.save(user);
        }
    }
    @Override
    public void updateProfile(long userID) {

    }
}

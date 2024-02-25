package com.online_portal.demo.services.impl;

import com.online_portal.demo.exception.UserNotFoundException;
import com.online_portal.demo.repository.UserRepository;
import com.online_portal.demo.services.UserService;
import com.online_portal.demo.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override

    public void createUser(UserModel user) throws UserNotFoundException {
        Optional<UserModel> userById=userRepository.findById(user.getUserID());
        if(userById.isPresent()){
            //System.out.println("userId already exist");
            throw new UserNotFoundException("user already exist");
        }
        else{
            userRepository.save(user);
        }
    }
    @Override
    public void updateProfile(UserModel userModel) {
        UserModel user=null;
        Optional<UserModel> userExist=userRepository.findById(userModel.getUserID());
        if(userExist.isPresent()){
            user=userExist.get();
            user.setFirstname(userModel.getFirstname());
            user.setLastname(userModel.getLastname());
            userRepository.save(user);
        }


    }
}

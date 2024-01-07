package com.springsecurity.demo.services;

import com.springsecurity.demo.dto.UserDto;
import com.springsecurity.demo.models.User;
import com.springsecurity.demo.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static com.springsecurity.demo.config.SecurityConfig.passwordEncoder;

@Service
public class UserService {
    private final UserRepo userRepo;
    UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }
    public List<User> getUserDetails(){
        return userRepo.findAll();
    }
    public void saveUser(UserDto userDto){
        User user=new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName(userDto.getUserName());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserPassword(passwordEncoder().encode(userDto.getUserPassword()));
        userRepo.save(user);
    }

    public User getUserById(String userId) {
       return userRepo.findByUserId(userId);
    }
}

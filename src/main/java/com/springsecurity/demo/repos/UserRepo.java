package com.springsecurity.demo.repos;

import com.springsecurity.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUserEmail(String email);

    User findByUserId(String userId);
    //List<User> getAllUser();
}

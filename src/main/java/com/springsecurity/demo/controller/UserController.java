package com.springsecurity.demo.controller;

import com.springsecurity.demo.dto.UserDto;
import com.springsecurity.demo.models.User;
import com.springsecurity.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getData(){
        return userService.getUserDetails();
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @PostMapping("/save-user")
    public void saveData(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
    }

    @GetMapping("/get-user")
    public String getUser(Principal principal){
        return principal.getName();
    }
}

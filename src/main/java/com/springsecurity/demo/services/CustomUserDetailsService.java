package com.springsecurity.demo.services;

import com.springsecurity.demo.models.CustomUserDetails;
import com.springsecurity.demo.models.User;
import com.springsecurity.demo.repos.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepo userRepository;

    public CustomUserDetailsService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByUserEmail(email);

        if (user != null) {
            return new CustomUserDetails(user);
        }else{
            throw new UsernameNotFoundException("Invalid username or password.");
        }
    }

}

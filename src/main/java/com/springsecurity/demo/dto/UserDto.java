package com.springsecurity.demo.dto;

import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
}

package com.springsecurity.demo.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    public String getUserId() {
        return userId;
    }

    @Id
    private String userId;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String userEmail;
    private String userPassword;
    //   @ManyToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
//    @JoinTable(
//            name="users_roles",
//            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
//            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private String roles;
}

package com.mortal.SpringBookBack.controller;


import com.mortal.SpringBookBack.model.User;
import com.mortal.SpringBookBack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}

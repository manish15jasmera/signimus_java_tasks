package com.example.User_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User_management.entity.User;
import com.example.User_management.service.UserService;


@RestController
@RequestMapping("/api/")
public class UserController {
  
  @Autowired
    private UserService userService;
  
  @PostMapping("save-user")  
  public String saveUserDetails(@RequestBody User user){
     userService.saveUser(user);
     return "User saved successfully";
  }; 
}

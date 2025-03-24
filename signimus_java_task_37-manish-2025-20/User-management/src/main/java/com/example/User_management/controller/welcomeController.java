package com.example.User_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class welcomeController {
  @GetMapping("/welcome")
  public String welcomeMessage(){
    return "welcome to the spring boot";
  }
}

package com.example.User_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User_management.entity.User;
import com.example.User_management.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserRepository userRepository;

  @Override
  public String saveUser(User user) {
    userRepository.save(user);
    return "user saved successfuly";  
  }
}

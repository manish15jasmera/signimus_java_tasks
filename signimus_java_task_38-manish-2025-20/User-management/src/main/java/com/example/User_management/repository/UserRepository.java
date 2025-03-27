package com.example.User_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.User_management.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

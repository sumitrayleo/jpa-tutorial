package com.tutorial.jpa.jpa10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.jpa.jpa10steps.entity.User;

@Repository
public interface UserRepositoryService extends JpaRepository<User, Long> {

    
}

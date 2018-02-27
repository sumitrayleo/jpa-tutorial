package com.tutorial.jpa.jpa10steps.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.jpa.jpa10steps.entity.User;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepositoryService userRepositoryService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "admin");
        userRepositoryService.save(user);
        log.info("Persisted a new user : " + user);
    }

}

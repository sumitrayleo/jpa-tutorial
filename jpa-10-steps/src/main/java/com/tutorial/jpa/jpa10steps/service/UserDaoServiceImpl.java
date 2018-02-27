package com.tutorial.jpa.jpa10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tutorial.jpa.jpa10steps.entity.User;

@Repository
@Transactional
public class UserDaoServiceImpl implements UserDAOService {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public User insert(User user) {
        manager.persist(user);
        return user;
    }

}

package com.tutorial.jpa.jpa10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    private Long Id;
    
    private String name;
    
    private String role;

    public User() {
    }

    public User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User [Id=" + Id + ", name=" + name + ", role=" + role + "]";
    }

}

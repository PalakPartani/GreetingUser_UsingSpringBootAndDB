package com.bl.demo.demo.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String userName;
    String password;
    LocalDateTime registeredDate;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }
}

package com.bl.demo.demo.model;

import com.bl.demo.demo.dto.UserDto;
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

    public User(UserDto userDto) {
        userName=userDto.userName;
        password=userDto.password;

    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}

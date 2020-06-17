package com.bl.demo.demo.dto;

import javax.persistence.*;
import java.time.LocalDateTime;

public class UserDto {

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

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
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
}

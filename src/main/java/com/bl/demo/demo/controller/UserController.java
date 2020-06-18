package com.bl.demo.demo.controller;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.model.User;
import com.bl.demo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody UserDto user){
        System.out.println("hello "+user.userName );
         return userService.addUser(user);
    }
    @GetMapping("/display")
    public List<User> displayUSer(){
        return userService.displayUser();
    }

}

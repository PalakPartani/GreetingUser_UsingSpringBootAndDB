package com.bl.demo.demo.controller;

import com.bl.demo.demo.dto.UserDto;
import com.bl.demo.demo.model.Response;
import com.bl.demo.demo.model.User;
import com.bl.demo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/greeting")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/user/{id}")
    public User displayById(@PathVariable Integer id) {
        return userService.displayUserById(id);
    }

   /* @PostMapping("/user")
    public User addUser(@RequestBody @Valid UserDto user) {
        System.out.println("hello " + user.firstName);
        return userService.addUser(user);
    }*/

    @GetMapping("/user")
    public List<User> displayUSer() {
        return userService.displayUser();
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable(name = "id") Integer id, @RequestBody UserDto user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam(name = "id") Integer id) {
        userService.deleteUser(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleUser(@PathVariable(name = "id") Integer id) {
        userService.deleteUser(id);

    }

    @PostMapping
    public ResponseEntity<Response> registerResponse(@Valid @RequestBody UserDto user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return new ResponseEntity(bindingResult.getAllErrors().get(0).getDefaultMessage(), HttpStatus.ALREADY_REPORTED);
        User user1 = userService.addUser(user);
        Response response = new Response("Register successful", user1, 101);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
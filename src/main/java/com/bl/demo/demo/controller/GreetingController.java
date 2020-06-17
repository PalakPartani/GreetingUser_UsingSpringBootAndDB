package com.bl.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/welcome")
    public String getGreetingMessage(){
        return "Welcome to spring boot ";
    }
}

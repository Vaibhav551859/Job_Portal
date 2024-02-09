package com.online_portal.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Rest api";

    }
    @GetMapping("/welcome")
    public String add(){
        return "Hello i am vaibhav jha";

    }
}

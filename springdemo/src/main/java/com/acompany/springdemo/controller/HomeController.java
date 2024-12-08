package com.acompany.springdemo.controller;

import com.acompany.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    private final UserService userService;

    @Autowired
    public HomeController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("")
    public Map<String, String> index() {

        return userService.getMessage();
    }
}

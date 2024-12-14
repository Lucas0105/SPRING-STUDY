package com.acompany.springdemo.controller;

import com.acompany.springdemo.annotation.TokenRequired;
import com.acompany.springdemo.model.User;
import com.acompany.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @TokenRequired
    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserByUserId(userId);
    }

    @PostMapping("")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PutMapping("")
    public void modifyUser(@RequestBody User user) {
        userService.modifyUserById(user);
    }

    @DeleteMapping("/{userId}")
    public void removeUser(@PathVariable Integer userId) {
        userService.removeUser(userId);
    }
}

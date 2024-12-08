package com.acompany.springdemo.controller;

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

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/userId")
    public User getUserById(Integer userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("")
    public void registerUser() {
        User user = TODO();
        userService.registerUser(user);
    }

    @PutMapping("/userId")
    public void modifyUser(Integer userId) {
        User user = TODO();
        userService.modifyUserById(userId, user);
    }

    @DeleteMapping("/userId")
    public void removeUser(Integer userId) {
        userService.removeUser(userId);
    }
}

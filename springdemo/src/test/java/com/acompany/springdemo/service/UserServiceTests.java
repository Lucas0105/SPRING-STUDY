package com.acompany.springdemo.service;

import com.acompany.springdemo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User(700, "kkim");
        userService.registerUser(user);
    }
}

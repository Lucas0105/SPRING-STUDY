package com.acompany.springdemo.dao;

import com.acompany.springdemo.model.User;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetAllUsers() {
        List<User> res = userRepository.getAllUsers();
        Assert.isTrue(!res.isEmpty());
    }

    @Test
    public void testGetUserByUserId() {
        User res = userRepository.getUserByUserId(100);
        Assert.notNull(res);
    }
}

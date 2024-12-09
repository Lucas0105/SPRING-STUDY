package com.acompany.springdemo.service;

import com.acompany.springdemo.dao.UserRepository;
import com.acompany.springdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public Map<String, String> getMessage() {
        Map<String, String> res = new HashMap<>();

        res.put("greet", "Hello, Boot");
        return res;
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User getUserByUserId(Integer userId){
        return userRepository.getUserByUserId(userId);
    }

    public User registerUser(User user){
        return userRepository.insertUser(user);
    }

    public void modifyUserById(User user)
    {
        userRepository.updateUser(user);
    }

    public void removeUser(Integer userId) {
        userRepository.deleteUser(userId);
    }
}

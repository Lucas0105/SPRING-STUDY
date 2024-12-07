package com.acompany.springdemo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public Map<String, String> getMessage() {
        Map<String, String> res = new HashMap<>();

        res.put("greet", "Hello, Boot");
        return res;
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
    
    @GetMapping("/greeting")
    public String requestMethodName(@RequestParam String param) {
        return String.format("Hello %s", param);
    }
    
}

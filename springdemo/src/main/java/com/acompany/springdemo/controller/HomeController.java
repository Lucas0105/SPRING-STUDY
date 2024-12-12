package com.acompany.springdemo.controller;

import com.acompany.springdemo.service.SecurityService;
import com.acompany.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    private final UserService userService;
    private final SecurityService securityService;
    @Autowired
    public HomeController(UserService userService, SecurityService securityService){
        this.userService = userService;
        this.securityService = securityService;
    }

    @GetMapping("")
    public Map<String, String> index() {

        return userService.getMessage();
    }

    @GetMapping("/security/generate/token")
    public Map<String, Object> generateToken(@RequestParam String subject){
        String token = securityService.createToken(subject, (2 * 1000 * 60));
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", token);
        return map;
    }

    @GetMapping("/security/get/subject")
    public Map<String, Object> getSubject(@RequestParam String token){
        String subject = securityService.getSubject(token);
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("result", subject);
        return map;
    }
}

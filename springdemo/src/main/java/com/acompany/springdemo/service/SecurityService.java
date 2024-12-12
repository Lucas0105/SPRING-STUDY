package com.acompany.springdemo.service;

public interface SecurityService {
    String createToken(String subject, long ttlMillis);
    String getSubject(String token);
}

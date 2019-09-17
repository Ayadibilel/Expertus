package com.expertus.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.expertus.spring.dto.UserRegistrationDto;
import com.expertus.spring.model.User;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}

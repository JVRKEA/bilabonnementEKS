package com.example.bilabonnementeks.service;

import com.example.bilabonnementeks.model.User;
import com.example.bilabonnementeks.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

private final UserRepository userRepository;

public LoginService(UserRepository userRepository){
    this.userRepository= userRepository;
}

public User validateLogin(String username, String password){
    return userRepository.validateLogin(username, password);
}

}

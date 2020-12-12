package com.tutorial.first.services;

import com.tutorial.first.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity signup(User user);
}

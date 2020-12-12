package com.tutorial.first.services;

import com.tutorial.first.entity.User;
import com.tutorial.first.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity signup(User user) {
        List<User> users = userRepository.findByUsername(user.getUsername());
        if (users.size() > 0){
            return (ResponseEntity) ResponseEntity.badRequest();
        }else {
            user = userRepository.save(user);
            return ResponseEntity.ok(user);
        }
    }
}

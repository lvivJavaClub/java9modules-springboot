package com.lohika.java9modules.user.service;

import com.lohika.java9modules.user.service.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(String id) {
        return userRepository.findOne(id);
    }
}

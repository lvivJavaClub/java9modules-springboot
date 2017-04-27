package com.lohika.java9modules.user.service.repo;

import com.lohika.java9modules.user.service.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

package com.lohika.java9modules.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@PropertySource(value = "service.properties")
@Configuration
@EnableMongoRepositories("com.lohika.java9modules.user.service")
public class UserServiceConfiguration {
}
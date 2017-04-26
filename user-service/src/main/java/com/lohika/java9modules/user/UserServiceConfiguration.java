package com.lohika.java9modules.user;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@PropertySource("service.properties")
@Configuration
@ComponentScan("com.lohika.java9modules.user.service")
@EnableMongoRepositories("com.lohika.java9modules.user.service")
public class UserServiceConfiguration {
}
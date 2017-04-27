package com.lohika.java9modules.api;

import com.lohika.java9modules.user.UserServiceConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(value = {
    "com.lohika.java9modules.api",
    "com.lohika.java9modules.user"
})
@Import(UserServiceConfiguration.class)
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

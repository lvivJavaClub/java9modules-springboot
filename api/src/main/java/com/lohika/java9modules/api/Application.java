package com.lohika.java9modules.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {
    "com.lohika.java9modules.api",
    "com.lohika.java9modules.user.service"
})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

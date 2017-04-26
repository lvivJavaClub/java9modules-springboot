package com.lohika.java9modules.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageService {

  public String getMessage() {
    return "Hi!";
  }
}

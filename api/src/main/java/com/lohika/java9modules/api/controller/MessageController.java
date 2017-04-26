package com.lohika.java9modules.api.controller;

import com.lohika.java9modules.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  @Autowired
  public MessageService messageService;

  @GetMapping()
  public String getMessage() {
    return messageService.getMessage();
  }
}

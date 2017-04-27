package com.lohika.java9modules.api.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCreateDto {
    private String name;
    private int age;
}

package com.lohika.java9modules.api.domain.user;

import com.lohika.java9modules.user.service.User;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class UserDto {
    private String id;
    private String name;
    private int age;

    public UserDto(User user) {
        id = user.getId();
        name = user.getName();
        age = user.getAge();
    }

    public UserDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

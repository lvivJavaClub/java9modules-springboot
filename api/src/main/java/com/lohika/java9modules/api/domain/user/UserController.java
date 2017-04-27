package com.lohika.java9modules.api.domain.user;

import com.lohika.java9modules.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<UserDto> getUsers() {
        return userService.findAll().stream().map(UserDto::new).collect(toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") String id) {
        return userService.getById(id).map(UserDto::new)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

//    @PostMapping
//    public UserDto createUser(@RequestBody UserCreateDto userCreateDto) {
//        return userService.createUser(userCreateDto);
//    }
//
//    @PutMapping("/{id}")
//    public UserDto updateUser(@PathVariable("id") String id, @RequestBody UserCreateDto userCreateDto) {
//        return userService.updateUser(id, userCreateDto);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable("id") String id) {
//        userService.deleteById(id);
//    }
}

package com.spring.security.bootwithsecurity.controller;

import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;
import com.spring.security.bootwithsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/{userId}")
    public ResponseEntity<ResponseDTO> getUser(@PathVariable("userId") Long id){
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
    }
    @PatchMapping("user/{userId}")
    public ResponseEntity<ResponseDTO> updateUser(@PathVariable("userId") Long id, @RequestBody User user){
        return new ResponseEntity<>(userService.updateUser(id, user),HttpStatus.OK);
    }


}

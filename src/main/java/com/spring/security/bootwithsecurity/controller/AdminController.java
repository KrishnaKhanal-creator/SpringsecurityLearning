package com.spring.security.bootwithsecurity.controller;

import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;
import com.spring.security.bootwithsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<ResponseDTO> signUp(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);
    }

    @PostMapping("/password")
    public ResponseEntity<ResponseDTO> forgetPassword(@RequestBody User user){
        return new ResponseEntity<>(userService.forgetPassword(user),HttpStatus.OK);
    }

    @PostMapping("/passwordChange")
    public ResponseEntity<ResponseDTO> resetPassword(@RequestBody User user){
        return new ResponseEntity<>(userService.resetPassword(user),HttpStatus.OK);
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<ResponseDTO> deleteUser(@PathVariable("userId") Long id){
        return new ResponseEntity<>(userService.deleteUser(id),HttpStatus.OK);
    }

}

package com.spring.security.bootwithsecurity.controller;

import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;
import com.spring.security.bootwithsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RestControllerAdvice
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new_user")
    public ResponseEntity<User> saveNewUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/userWithResponseDTO")
    public ResponseEntity<ResponseDTO> saveuser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUserWithResponseDTO(user), HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> listUserById(@PathVariable("id") Long id){
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }

    @GetMapping("/list_all")
    public ResponseEntity<List<User>> listAllUsers(){
        return new ResponseEntity<>(userService.findAllUser(),HttpStatus.OK);
    }

    @PostMapping("/user_updaate")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

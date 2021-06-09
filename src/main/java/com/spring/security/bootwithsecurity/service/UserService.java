package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findById(Long id);

    List<User> findAllUser();

    void updateUser(User user);

    void deleteUser(Long id);

    ResponseDTO saveUserWithResponseDTO(User user);

}

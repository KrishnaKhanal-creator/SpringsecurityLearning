package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.dao.UserRepository;
import com.spring.security.bootwithsecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void findById(int id) {
//       userRepository.findById(id).get();
    }

    @Override
    public void findAllUser() {
        userRepository.findAll();
    }

    @Override
    public void updateUser(int id) {

    }

    @Override
    public void deleteUser(int id) {

    }
}

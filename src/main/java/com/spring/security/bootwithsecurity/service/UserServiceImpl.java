package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;
}

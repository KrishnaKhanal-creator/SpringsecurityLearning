package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.entity.User;

public interface UserService {

    void saveUser(User user);

    void findById(int id);
    void findAllUser();

    void updateUser(int id);

    void deleteUser(int id);


}

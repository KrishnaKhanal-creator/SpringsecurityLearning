package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.dao.UserRepository;
import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public ResponseDTO saveUserWithResponseDTO(User user) {
        User createdUser = userRepository.save(user);
        return ResponseDTO.builder().message("user is saved").user(createdUser).build();
    }

//    @Override
//    public ResponseDTO saveUserWithResponseDTO(User user) {
//        User createdUser = userRepository.save(user);
//        ResponseDTO responseDTO = new ResponseDTO();                      //this is the older version but now we can use builder instead
//        responseDTO.setMessage("User info has been set");
//        responseDTO.setUser(createdUser);
//        return responseDTO;
//    }
}

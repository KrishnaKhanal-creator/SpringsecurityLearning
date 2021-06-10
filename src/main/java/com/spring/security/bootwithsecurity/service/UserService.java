package com.spring.security.bootwithsecurity.service;

import com.spring.security.bootwithsecurity.dao.UserRepository;
import com.spring.security.bootwithsecurity.entity.User;
import com.spring.security.bootwithsecurity.model.ResponseDTO;
import com.spring.security.bootwithsecurity.utility.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    //to save a new user
    public ResponseDTO saveUser(User user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));//encode the password
        user.setToken(UUID.randomUUID().toString());//to set the token automatically
        User createdUser = userRepository.save(user);
        return ResponseDTO.builder().responseType(CommonConstants.SUCCESS).responseData(createdUser).responseMessage(CommonConstants.REGISTER_USER).build();
    }

    //to get user by id
    public ResponseDTO getUser(Long id){
        User dbUser = userRepository.findById(id).get();
        return ResponseDTO.builder().responseType(CommonConstants.SUCCESS).responseData(dbUser).build();
    }
    //to delete the user by id
    public ResponseDTO deleteUser(Long id){
        userRepository.deleteById(id);
        return ResponseDTO.builder().responseType(CommonConstants.SUCCESS).responseMessage(CommonConstants.DELETE_USER).build();
    }

    //to update the user
    public ResponseDTO updateUser(Long id, User user){
        User dbUser = userRepository.findById(id).get();
        dbUser.setContact(user.getContact());
        User updatedUser = userRepository.save(dbUser);
        return ResponseDTO.builder().responseType(CommonConstants.SUCCESS).responseMessage(CommonConstants.UPDATE_USER).responseData(updatedUser).build();
    }

    public ResponseDTO forgetPassword(User user){

        User dbUser = userRepository.findByEmail(user.getEmail());//Making our own findByEmail method.  just write (findBy)+(e->E)mail....
        dbUser.setActive(false);
        dbUser.setToken(UUID.randomUUID().toString());
        User updatedUser = userRepository.save(dbUser);
        return ResponseDTO.builder().responseType(CommonConstants.SUCCESS).responseMessage(CommonConstants.UPDATE_USER).responseData(updatedUser).build();
    }
    public ResponseDTO resetPassword(User user){
        return null;
    }

}

package com.spring.security.bootwithsecurity.dao;

import com.spring.security.bootwithsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

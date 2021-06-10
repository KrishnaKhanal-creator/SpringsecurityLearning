package com.spring.security.bootwithsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)//the exclude is to disable the security
public class BootWithSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWithSecurityApplication.class, args);
    }

}

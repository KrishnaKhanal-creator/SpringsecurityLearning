package com.spring.security.bootwithsecurity.entity;

import com.spring.security.bootwithsecurity.utility.CommonConstants;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "user_tbl")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = CommonConstants.EMPTY_NAME)
    private String name;

    @NotBlank(message = CommonConstants.USERNAME_EMPTY)
    @Column(unique = true)
    private String userName;

    @NotNull(message = CommonConstants.PASSWORD_EMPTY)
    private String password;

    @Email(message = CommonConstants.INVALID_EMAIL)
    @NotBlank(message = CommonConstants.EMAIL_EMPTY)
    @Column(unique = true)
    private String email;

    private boolean isActive;
    private Long contact;

    private String token;
    @CreationTimestamp
    private Date createdTime;
    @UpdateTimestamp
    private Date updatedTime;

}

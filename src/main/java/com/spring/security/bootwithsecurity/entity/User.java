package com.spring.security.bootwithsecurity.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "user_tbl")
public class User {

    @Id
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    private boolean isActive;
    private Long contact;
    @NotNull
    private String password;

}

package com.spring.security.bootwithsecurity.model;

import com.spring.security.bootwithsecurity.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private String message;
    private User user;
}

package com.spring.security.bootwithsecurity.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class APIException extends RuntimeException{

    private String errorMessage;
}

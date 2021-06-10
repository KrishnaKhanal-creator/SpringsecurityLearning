package com.spring.security.bootwithsecurity.exception;

import com.spring.security.bootwithsecurity.model.ResponseDTO;
import com.spring.security.bootwithsecurity.utility.CommonConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> handleErrorResponse(Exception exception){
        return new ResponseEntity<ResponseDTO>
                (ResponseDTO.builder().responseType(CommonConstants.Error).responseMessage(exception.getMessage()).build(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(APIException.class)
    public ResponseEntity<ResponseDTO> handleErrorResponse(APIException apiException){
        return new ResponseEntity<ResponseDTO>
                (ResponseDTO.builder().responseType(CommonConstants.Error).responseMessage(apiException.getErrorMessage()).build(),
                HttpStatus.BAD_REQUEST);
    }
}

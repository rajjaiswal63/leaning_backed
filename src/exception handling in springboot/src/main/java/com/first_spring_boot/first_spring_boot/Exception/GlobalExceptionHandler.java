package com.first_spring_boot.first_spring_boot.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    // Exception handling method
    @ExceptionHandler({IllegalArgumentException.class, NullPointerException.class, UserNotFoundException.class} )
    public ResponseEntity<Map<String, Object>> handleIllegalArguments(
            Exception exception
    ){
        logger.error("error when finding user");
        Map<String,Object> errorResponse=new HashMap<>();
        errorResponse.put("message",exception.getMessage());
        errorResponse.put("time", LocalDateTime.now());
        errorResponse.put("message",exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Map<String,Object>>hir(
            Exception exception
    ){
        Map<String,Object> errorResponse=new HashMap<>();
        errorResponse.put("message",exception.getMessage());
        errorResponse.put("time", LocalDateTime.now());
        errorResponse.put("message",exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }
}

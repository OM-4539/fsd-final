package com.example.backend.controller;

import com.example.backend.exception.DataNotFoundException;
import com.example.backend.utils.ResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<Object> handlerDataNotFound(Exception e){
        return ResponseHandler.responseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}

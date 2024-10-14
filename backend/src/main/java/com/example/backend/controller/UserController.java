package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.service.UserService;
import com.example.backend.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create/user")
    public ResponseEntity<Object> createUser(@RequestBody User user){
      String response =  userService.createUser(user);
      return ResponseHandler.responseEntity(response, HttpStatus.CREATED);
    }

}

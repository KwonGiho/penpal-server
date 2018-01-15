package com.example.demo.controllers;

import com.example.demo.request.UserDeleteRequest;
import com.example.demo.request.UserLoginRequest;
import com.example.demo.request.UserRegisterRequest;
import com.example.demo.response.PenpalResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kwongiho on 2018. 1. 15..
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public PenpalResponse<?> registerUser(@RequestBody UserRegisterRequest body) {
        logger.info("POST /api/v1/user : {} ",body);
        return new PenpalResponse<>(HttpStatus.OK.value(),"SUCCESS",body);
    }

    @PostMapping("/login")
    public PenpalResponse<?> loginUser(@RequestBody UserLoginRequest body) {
        logger.info("POST /api/v1/user/login : {} ",body);
        return new PenpalResponse<>(HttpStatus.OK.value(),"SUCCESS",body);
    }

    @DeleteMapping
    public PenpalResponse<?> deleteUser(@RequestBody UserDeleteRequest body) {
        logger.info("DELETE /api/v1/user : {} ",body);
        return new PenpalResponse<>(HttpStatus.OK.value(),"SUCCESS",body);
    }


}

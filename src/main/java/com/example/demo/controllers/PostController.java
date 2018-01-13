package com.example.demo.controllers;

import com.example.demo.request.PostNewRequest;
import com.example.demo.response.PenpalResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @PostMapping("/new")
    public PenpalResponse<?> newPost(@RequestBody PostNewRequest body) {
        return new PenpalResponse<>(200,"SUCCESS",body);
    }
}

package com.example.demo.controllers;

import com.example.demo.repository.PostRepository;
import com.example.demo.request.PostNewRequest;
import com.example.demo.response.PenpalResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final String KEY = "PENPAL_POST";

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public PenpalResponse<?> newPost(@RequestBody PostNewRequest body) {
        logger.info("POST /api/v1/post : {}",body);


        return new PenpalResponse<>(200,"SUCCESS",body);
    }

    @GetMapping("/{postId}")
    public PenpalResponse<?> getPost(@PathVariable int postId) {
        logger.info("GET /api/v1/post/{} ",postId);
        return new PenpalResponse<>(200,"SUCCESS",postId);
    }

    @PutMapping
    public PenpalResponse<?> updatePost(@RequestBody PostNewRequest body) {
        logger.info("PUT /api/v1/post : {} ",body);
        return new PenpalResponse<>(200,"SUCCESS",body);
    }

}

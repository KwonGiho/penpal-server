package com.example.demo.controllers;

import com.example.demo.dto.Post;
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

    @Autowired
    private PostRepository postRepository;
    /*
    private int postId;
    private String title;
    private String content;
    private long writtenDate;
    private String userId;
    */

    @PostMapping
    public PenpalResponse<?> newPost(@RequestBody PostNewRequest body) {
        logger.info("POST /api/v1/post : {}",body);
        Post post = postRepository.savePost(new Post(1,body.getTitle(),body.getContent(),System.currentTimeMillis(),"giho"));

        return new PenpalResponse<>(200,"SUCCESS",post);
    }

    @GetMapping("/{postId}")
    public PenpalResponse<?> getPost(@PathVariable int postId) {
        logger.info("GET /api/v1/post/{} ",postId);
        Post post = postRepository.findPost(postId);
        return new PenpalResponse<>(200,"SUCCESS",post);
    }

    @PutMapping
    public PenpalResponse<?> updatePost(@RequestBody PostNewRequest body) {
        logger.info("PUT /api/v1/post : {} ",body);
        return new PenpalResponse<>(200,"SUCCESS",body);
    }

}

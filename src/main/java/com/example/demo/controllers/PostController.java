package com.example.demo.controllers;

import com.example.demo.dto.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.request.PostDeleteRequest;
import com.example.demo.request.PostNewRequest;
import com.example.demo.response.PenpalResponse;
import com.example.demo.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PostService postService;

    @PostMapping
    public PenpalResponse<?> newPost(@RequestBody PostNewRequest body) {
        logger.info("POST /api/v1/post : {}",body);

        Post post = postService.insertPost(body);

        return new PenpalResponse<>(200,"SUCCESS",post);
    }

    @GetMapping("/{postId}")
    public PenpalResponse<?> getPost(@PathVariable int postId) {
        logger.info("GET /api/v1/post/{} ",postId);
        Post post = postService.findPost(postId);
        return new PenpalResponse<>(200,"SUCCESS",post);
    }

    @GetMapping("/")
    public PenpalResponse<?> getPostAll() {
        logger.info("GET /api/v1/post/ ");
        Map<String,Post> postMap = postService.findAllByMap();
        return new PenpalResponse<>(200,"SUCCESS",postMap);
    }

    @PutMapping
    public PenpalResponse<?> updatePost(@RequestBody PostNewRequest body) {
        logger.info("PUT /api/v1/post : {} ",body);
        return new PenpalResponse<>(200,"SUCCESS",body);
    }

    @DeleteMapping
    public PenpalResponse<?> deletePost(@RequestBody PostDeleteRequest body) {
        logger.info("DELETE /api/v1/post : {} ",body);
        return new PenpalResponse<>(200,"SUCCESS",body);
    }

}

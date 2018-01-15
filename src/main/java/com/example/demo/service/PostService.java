package com.example.demo.service;

import com.example.demo.dto.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.request.PostNewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;

/**
 * Created by kwongiho on 2018. 1. 14..
 */
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post insertPost(PostNewRequest postNewRequest) {

        Post post = new Post(1,postNewRequest.getTitle(),postNewRequest.getContent(),System.currentTimeMillis(),postNewRequest.getUserId());
        return postRepository.savePost(post);
    }

    public Post findPost(int postId) {
        Post post = postRepository.findPost(postId);

        return post;
    }

    public List<Post> findAllByList(int startIndex, int lastIndex) {
        List<Post> posts = postRepository.findAllPost(0,1);
        return posts;
    }
    public Map<String, Post> findAllByMap () {
        Map<String,Post> postMap = postRepository.findAllPost();
        return postMap;
    }
}

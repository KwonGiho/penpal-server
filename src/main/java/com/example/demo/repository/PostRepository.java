package com.example.demo.repository;

import com.example.demo.dto.Post;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
public interface PostRepository {

    Post savePost(Post post);

    Post updatePost(Post board);

    Post findPost(int id);

    //Map<String, Post> findAllBoard();

    void deletePost(String postId);


}
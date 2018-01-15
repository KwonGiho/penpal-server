package com.example.demo.repository;

import com.example.demo.dto.Post;

import java.util.List;
import java.util.Map;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
public interface PostRepository {

    Post savePost(Post post);

    Post updatePost(Post board);

    Post findPost(int postId);

    Map<String, Post> findAllPost();

    List<Post> findAllPost(int startIndex,int lastIndex);


    void deletePost(String postId);


}
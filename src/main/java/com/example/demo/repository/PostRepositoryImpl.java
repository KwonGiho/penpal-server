package com.example.demo.repository;

import com.example.demo.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by kwongiho on 2018. 1. 13..
 */
@Repository
public class PostRepositoryImpl implements PostRepository {
    private final String KEY = "PENPAL_POST";

    private RedisTemplate<String,Post> redisTemplate;
    private HashOperations hashOps;
    private ListOperations listOps;


    @Autowired
    public PostRepositoryImpl(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {
        hashOps = redisTemplate.opsForHash();
        listOps = redisTemplate.opsForList();


    }


    @Override
    public Post savePost(Post post) {
        hashOps.put(KEY,post.getPostId(),post);
        return findPost(post.getPostId());
    }

    @Override
    public Post updatePost(Post post) {
        hashOps.put(KEY,post.getPostId(),post);
        return findPost(post.getPostId());
    }

    @Override
    public Post findPost(int postId) {
        return (Post)hashOps.get(KEY,postId);
    }

    @Override
    public List<Post> findAllPost(int startIndex, int lastIndex) {
        listOps.range(KEY,startIndex,lastIndex);
        return null;
    }

    @Override
    public Map<String, Post> findAllPost() {
        return hashOps.entries(KEY);
    }

    @Override
    public void deletePost(String postId) {
        hashOps.delete(KEY,postId);
    }
}

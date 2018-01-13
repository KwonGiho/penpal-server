package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


/**
 * Created by kwongiho on 2018. 1. 13..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("PENPAL_POST")
public class Post implements Serializable{
    private int postId;
    private String title;
    private String content;
    private long writtenDate;
    private String userId;
}
